package test;

public class Solution {
	static int[] result=new int[2];
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
        
            for(int n=i+1;n<nums.length;n++){
                if(nums[i]+nums[n]==target){
                    result[0]=i;
                    result[1]=n;
                    return result;
                }
                else continue;
            }
        }
        return result;
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1,7,0,13};
		int target=9;
		result=twoSum(nums,target);
		System.out.println(result[0]+","+result[1]);
	}

}
