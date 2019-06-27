package test;

public class Merge {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3=new int[m+n];
        int i=0,p=0,q=0;
        while(i<m&&p<n){
            nums3[q++]=(nums1[i]<nums2[p])?nums1[i++]:nums2[p++];
        }
        while(i<m) nums3[q++]=nums1[i++];
        while(p<n) nums3[q++]=nums2[p++];
        nums1=nums3;
        System.out.println(nums1[5]);
        System.out.println(nums3[5]);
    }
	public static boolean isPalindrome(String s) {
        int l=s.length();
        StringBuilder a=new StringBuilder();
        for(int i=0;i<l;i++){
            if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i))){
                a.append(s.charAt(i));
                
            }
        }
      //  StringBuilder b=a.reverse();
      
        
        return a.toString().equalsIgnoreCase(a.reverse().toString());
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a={1,2,3,0,0,0};
		//int[] b={2,5,6};
		String c="race a car";
		
		System.out.println(isPalindrome(c));
	}

}
