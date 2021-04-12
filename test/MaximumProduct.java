package test;
//no.628
import java.util.Arrays;

public class MaximumProduct {
    public int maximumProduct(int[] nums) {
    	Arrays.sort(nums);
    	int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={-1,-2,-3};
		MaximumProduct m=new MaximumProduct();
		System.out.println(m.maximumProduct(a));
	}

}
