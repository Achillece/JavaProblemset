package test;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
    	int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0)sum += num;
            else sum = num;
            res = Math.max(res, sum);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={-2,1,-3,4,-1,2,1,-5,4};
		MaxSubArray maxSubArray=new MaxSubArray();
		System.out.println(maxSubArray.maxSubArray(a));
	}

}
