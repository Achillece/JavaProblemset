package test;
//no.162
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
    /*public int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        if(nums.length==2)return nums[0]>nums[1]?0:1;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]&&nums[i]>nums[i-1])return i;
        }
        return nums[0]>nums[nums.length-1]?0:nums.length-1;
    }*/
}
