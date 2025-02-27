/*
 * @lc app=leetcode.cn id=922 lang=java
 * @lcpr version=30204
 *
 * [922] 按奇偶排序数组 II
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while(l < nums.length && r >= 0) {
            if (nums[l] % 2 == 0) {
                l+= 2;
            } else if (nums[r] % 2 == 1) {
                r -= 2;
            } else {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
        }

        return nums;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,5,7]\n
// @lcpr case=end

// @lcpr case=start
// [2,3]\n
// @lcpr case=end

 */

