/*
 * @lc app=leetcode.cn id=1287 lang=java
 * @lcpr version=30204
 *
 * [1287] 有序数组中出现次数超过25%的元素
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findSpecialInteger(int[] arr) {
        int size = arr.length / 4;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + size]) {
                return arr[i];
            }
        }
        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,6,6,6,6,7,10]\n
// @lcpr case=end

 */

