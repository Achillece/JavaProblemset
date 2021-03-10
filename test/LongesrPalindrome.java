package test;
public class LongesrPalindrome {
	/*public static String longestPalindrome(String s) {
        String result=new String();
        if(s.length()==1) return s;
        for(int i=0;i<s.length();i++){
            for(int n=i;n<s.length();n++){
                if(checkPalindrome(s.substring(i,n+1))){
                    result=(result.length()<(n-i+1))?s.substring(i,n+1):result;
                }
            }
        }
        return result;
    }
    public static boolean checkPalindrome(String s){
       StringBuilder str=new StringBuilder(s);
        if(str.reverse().toString().equals(s)) return true;
        else return false;
    }
	 public static String longestPalindrome(String s) {
	        String result=new String();
	        int i=0,n=0;
	        while(s.charAt(i)==s.charAt(i+1)&&i<s.length()-1){
	            result=(result.length()<one(i,s).length())?one(i,s):result;
	            i++;
	        }
	        while(n<s.length()){
	            result=(result.length()<two(n,s).length())?two(n,s):result;
	            n++;
	        }
	        return result;
	    }
	    public static String one(int i,String s){
	        int n=i+1;
	        while(s.charAt(i)==s.charAt(n)){
	            i--;n++;
	        }
	        String result=s.substring(i+1,n);
	        return result;
	    }
	    public static String two(int i,String s){
	        if(i==0||i==s.length()-1){
	            return s.charAt(i)+"";
	        }
	        int m=i-1,n=i+1;
	        while(s.charAt(m)==s.charAt(n)){
	            m--;n++;
	        }
	        String result=s.substring(m+1,n);
	        return result;
	    }*/
	public static String longestPalindrome(String s) {
	    if (s == null || s.length() < 1) return "";
	    int start = 0, end = 0;
	    for (int i = 0; i < s.length(); i++) {
	        int len1 = expandAroundCenter(s, i, i);
	        int len2 = expandAroundCenter(s, i, i + 1);
	        int len = Math.max(len1, len2);
	        if (len > end - start) {
	            start = i - (len - 1) / 2;
	            end = i + len / 2;
	        }
	    }
	    return s.substring(start, end + 1);
	    }
	 private static int expandAroundCenter(String s, int left, int right) {
	    int L = left, R = right;
	    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
	        L--;
	        R++;
	    }
	    return R - L - 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abba";
		System.out.println(longestPalindrome(s));
		
	}

}
