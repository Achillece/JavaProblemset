/*
 * @lc app=leetcode.cn id=198 lang=java
 * @lcpr version=30204
 *
 * [198] 打家劫舍
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                continue;
            if (i == 1) {
                res = Math.max(nums[i], nums[i - 1]);
                nums[i] = res;
            }
            if (i > 1) {
                res = Math.max(nums[i - 1], nums[i - 2] + nums[i]);
                nums[i] = res;
            }
        }

        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,1]\n
// @lcpr case=end

// @lcpr case=start
// [2,7,9,3,1]\n
// @lcpr case=end

 */

