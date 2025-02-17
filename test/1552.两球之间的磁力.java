/*
 * @lc app=leetcode.cn id=1552 lang=java
 * @lcpr version=30204
 *
 * [1552] 两球之间的磁力
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 1, right = position[position.length - 1] - position[0];
        int ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (check(position, mid, m)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    private boolean check(int[] position, int mid, int m) {
        int count = 1;
        int pre = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] - pre >= mid) {
                count++;
                pre = position[i];
            }
        }
        return count >= m;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,7]\n3\n
// @lcpr case=end

// @lcpr case=start
// [5,4,3,2,1,1000000000]\n2\n
// @lcpr case=end

 */

