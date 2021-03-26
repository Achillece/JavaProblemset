package test;


public class FirstMissingPositive {
	public static int firstMissingPositive(int[] nums) {
		int len = nums.length;
        int[] a = new int[len+1];
        for(int i=0;i<len;i++){
            if(nums[i]>0&&nums[i]<len+1){
                a[nums[i]]=nums[i];
            }
        }
        for(int i=1;i<len+1;i++){
            if(a[i]>0)continue;
            else return i;
        }
		return len+1;
     
    }
	public static void main(String[] args) {
		int[] a = {-1,-2,-3};
		//int[] a = {1,2,3};
		//int[] a = {1,7,8,9,10,11};
		System.out.println(firstMissingPositive(a));
	}

}
