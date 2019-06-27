package test;

public class MoveZeroes {
	 public void moveZeroes(int[] nums) {
	        int s=0,l=nums.length;
	        for(int num:nums){
	            if(num==0) break;
	            else s++;
	        }
	        int i=s;
	        while(i<l&&s<l){
	            if(nums[i]!=0){
	                int temp=nums[i];
	                nums[i]=nums[s];
	                nums[s]=temp;
	                s++;
	            }
	            i++;
	            
	        }
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
