package test;


public class SearchRange {
	public static int[] searchRange(int[] nums, int target) {
		int[] a ={-1,-1};
		a[0] = SearchRange.border(nums,target,true);
		a[1] = SearchRange.border(nums, target, false);
		return a;
	}
	public static int border(int[] nums, int target, boolean leftOrRight){
		int res = -1;
		int l = 0, r = nums.length-1,mid;
		while(l<=r){
			mid = (l+r)/2;
			if(target<nums[mid]){
				r=mid-1;
			}else if(target>nums[mid]){
				l=mid+1;
			}else{
				res=mid;
				if(leftOrRight){
					r=mid-1;
				}else{
					l=mid+1;
				}
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,7,7,8,8,10};
		System.out.println(searchRange(a, 8)[0]);
		System.out.println(searchRange(a, 8)[1]);
	}

}
