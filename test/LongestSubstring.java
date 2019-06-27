package test;

public class LongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		//s=s.replaceAll(" ", "!");
        String sub=new String("");
        int num=0,a=0;
        for(int i=0;i<s.length();i++){
            if(sub.contains(s.charAt(i)+"")){
            	int m=0;
                while(sub.charAt(m)!=s.charAt(i)) m++;
                if(a>num)
                    num=a;
                sub=sub.substring(m+1)+s.charAt(i);a=sub.length();
            }else{
                sub+=s.charAt(i);
                a++;
            }
                
        }if(a>num) num=a;
        return num;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" ";
		System.out.println(lengthOfLongestSubstring(str));
		System.out.println(str.replace(" ","!"));
	}

}
