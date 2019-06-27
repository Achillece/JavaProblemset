package test;

public class FindMedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int[] nums=new int[nums1.length+nums2.length];
    	int i=0,j=0,m=0;
    	while(i<nums1.length && j<nums2.length){
    		nums[m++]=(nums1[i]<nums2[j])?nums1[i++]:nums2[j++];
    	}
    	while(i<nums1.length) nums[m++]=nums1[i++];
    	while(j<nums2.length) nums[m++]=nums2[j++];
    	if(nums.length%2==0)
    		return (nums[m/2-1]+nums[m/2])/2.0;
    	else 
    		return nums[m/2];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,5,6};
		int[] b={2,4};
		double median=findMedianSortedArrays(a,b);
		System.out.println(median);
	}

}
