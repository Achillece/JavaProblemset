package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
		Map<Integer,Integer> map=new HashMap<>();
		int l=nums.length;
		for(int i=0;i<l;i++){
			if(!map.containsKey(nums[i])){
				map.put(nums[i], 1);
			}else{
				int value=map.get(nums[i]);
				value++;
				map.put(nums[i], value);
			}
		}
		Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
		for(Map.Entry<Integer,Integer> a:entrySet){
			if(a.getValue()>Math.floor(l/2)){
				return a.getKey();
			}
		}
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,2,3};
		System.out.println(majorityElement(a));
	}

}
