package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> list=new ArrayList<>();
    	if(nums.length<4)return list;
    	Arrays.sort(nums);
    	for(int i=0;i<nums.length-3;i++){
    		if(i>0 && nums[i]==nums[i-1]) continue;
    		int temp=target-nums[i];
    		for(int j=i+1;j<nums.length-2;j++){
    			if(j>i+1 && nums[j]==nums[j-1]) continue;
    			int l=j+1,r=nums.length-1;
    			while(l<r){
    				int result=nums[j]+nums[l]+nums[r];
    				if(result==temp){
        				list.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
        				while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;
                        l++;
                        r--;
        			}else if(result<temp){
        				while (l < r && nums[l] == nums[l + 1]) l++; 
        				l++;
        			}else{
        				while (l < r && nums[r] == nums[r - 1]) r--;
                        r--;
        			}
    			}
    		}
    	}
		return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1, 0, -1, 0, -2, 2};//-2,-1,0,0,1,2
		int target=0;
		System.out.println(fourSum(nums,target));
	}

}
