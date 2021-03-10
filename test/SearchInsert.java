package test;

public class SearchInsert {

	public static int searchInsert(int[] nums, int target){
		int l=0,r=nums.length-1,mid;
		while(l<=r){
			mid=(l+r)/2;
			if(target==nums[mid]){
				return mid;
			}
			if(target>nums[mid]){
				l=mid+1;
			}else{
				r=mid-1;
			}
		}
		return l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 2;
		int[] a = {1,3,5,6};
		System.out.println(searchInsert(a, target));
	}

}
