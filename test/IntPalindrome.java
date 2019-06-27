package test;

public class IntPalindrome {
    public static boolean isPalindrome(int x) {
    	 StringBuilder a=new StringBuilder(x+"");
         if((x+"").equals(a.reverse().toString()))
             return true;
         else
             return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=121;
		System.out.println(isPalindrome(a));
	}

}
