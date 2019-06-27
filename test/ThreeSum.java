package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author song
 * @time 2019/6/14/11.42
 */
public class ThreeSum {
	  public static List<List<Integer>> threeSum(int[] nums) {
	        Arrays.sort(nums);
	        List<List<Integer>> ls = new ArrayList<>();
	 
	        for (int i = 0; i < nums.length - 2; i++) {
	            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {  // 跳过可能重复的答案
	 
	                int l = i + 1, r = nums.length - 1, sum = 0 - nums[i];
	                while (l < r) {
	                    if (nums[l] + nums[r] == sum) {
	                        ls.add(Arrays.asList(nums[i], nums[l], nums[r]));
	                        while (l < r && nums[l] == nums[l + 1]) l++;
	                        while (l < r && nums[r] == nums[r - 1]) r--;
	                        l++;
	                        r--;
	                    } else if (nums[l] + nums[r] < sum) {
	                        while (l < r && nums[l] == nums[l + 1]) l++;   // 跳过重复值
	                        l++;
	                    } else {
	                        while (l < r && nums[r] == nums[r - 1]) r--;
	                        r--;
	                    }
	                }
	            }
	        }
	        return ls;
	    }
/*	 public static List<List<Integer>> threeSum(int[] nums) {
	    	Arrays.sort(nums);
	    	List<List<Integer>> list = new ArrayList<List<Integer>>();
	    	int len=nums.length;
	    	if(len<3)return list;
	    	for(int i=1;i<len-1;i++){
	            //while (nums[i] == nums[i - 1]) i++;
	            int l=0,r=len-1;
	    		while(l<i&&r>i){
	    			int temp=nums[l]+nums[i]+nums[r];
	    			if(temp==0){
	    				 list.add(Arrays.asList(nums[l], nums[i], nums[r]));
	    				 while (nums[l] == nums[l + 1]) l++;
	                     while (nums[r] == nums[r - 1]) r--;
	                     l++;
	                     r--;
	    			}else if(temp<0){
	    				while (nums[l] == nums[l + 1]) l++;   // 跳过重复值
	                    l++;
	    			}else{
	    				while (nums[r] == nums[r - 1]) r--;
	                    r--;
	    			}
	    		}
	    	}
	    	return list;
	    }*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-1,0,1,2,-1,-4};//-4,-1,-1,-1,0,1,2
		//int b[]={2,-1,-1,2};//-1,-1,2,2
		System.out.println(threeSum(a));
	}

}
