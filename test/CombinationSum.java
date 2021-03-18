package test;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	private static List<Integer> one = new ArrayList<Integer>();
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		result(candidates,target,result,0);
		return result;
    }
	private void result(int[] candidates, int target, List<List<Integer>> result, int begin){
		if(target == 0){
			result.add(new ArrayList<>(one));
			return;
		}
		for(int i=begin;i<candidates.length;i++){
			if(target-candidates[i]<0) continue;
			one.add(candidates[i]);
			result(candidates, target-candidates[i], result, i);
			one.remove((Integer)candidates[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,5};
		CombinationSum combinationSum = new CombinationSum();
		System.out.println(combinationSum.combinationSum(a, 8));
		System.out.println(a.equals(new int[]{3,2,5}));
	}

}
