/*
 * @lc app=leetcode.cn id=209 lang=java
 * @lcpr version=30204
 *
 * [209] 长度最小的子数组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int total = 0;
        int l = 0, r = 0;
        int res = nums.length + 1;

        while (r < nums.length) {
            if (total < target) {
                total += nums[r++];
            } else {
                res = Math.min(res, r - l);
                total -= nums[l++];
            }
        }

        while (total >= target) {
            res = Math.min(res, r - l);
            total -= nums[l++];
        }

        return res == nums.length + 1 ? 0 : res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 7\n[2,3,1,2,4,3]\n
// @lcpr case=end

// @lcpr case=start
// 4\n[1,4,4]\n
// @lcpr case=end

// @lcpr case=start
// 11\n[1,1,1,1,1,1,1,1]\n
// @lcpr case=end

 */

