package test;

public class FindMin {
    public int findMin(int[] nums) {
    	if(nums.length==1)return nums[0];
    	int l=0,r=nums.length-1;
    	while(l<r){
    		int mid=(l+r)/2;
    		if(nums[mid]<nums[r]){
    			r=mid;
    		}else if(nums[mid]==nums[r]){
    			r=r-1;
    		}else{
    			l=mid+1;
    		}
    	}
		return nums[l];

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,1,3};
		FindMin findMin=new FindMin();
		System.out.println(findMin.findMin(a));
	}

}
