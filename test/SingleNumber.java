package test;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
		int result=0,l=nums.length;
		for(int i=0;i<l;i++){
			result^=nums[i];
		}
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,4,2,2,1};
		System.out.println(singleNumber(a));
	}

}
