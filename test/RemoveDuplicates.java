package test;

public class RemoveDuplicates {
	public static int removeDuplicates(int[] nums) {
		if(nums.length<2)return nums.length;
		int i=0,n=0;
		while(i<nums.length-1){
			if(nums[n]!=nums[++i])nums[++n]=nums[i];
		}
		return n+1;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,2};
		int n=removeDuplicates(a);
		System.out.println(n);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
