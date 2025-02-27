package test;

/*
 * @lc app=leetcode.cn id=905 lang=java
 * @lcpr version=30204
 *
 * [905] 按奇偶排序数组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while(l<r) {
            if (nums[l] % 2 == 0) {
                l++;
            } else if(nums[r] % 2 == 1) {
                r--;
            } else {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
        }
        return nums;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,1,2,4]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n
// @lcpr case=end

 */

