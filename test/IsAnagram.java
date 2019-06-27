package test;

//import java.util.HashMap;
//import java.util.Map;

public class IsAnagram {
	/*public static boolean isAnagram(String s, String t) {
		Map<Character,Integer> map1=a(s);
		Map<Character,Integer> map2=a(t);
		if(map1.equals(map2))
			return true;
		else
			return false;
    }
	private static Map<Character,Integer> a(String s){
		Map<Character,Integer> map=new HashMap<>();
		int l=s.length();
		for(int i=0;i<l;i++){
			if(!map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), 1);
			}else{
				int value=map.get(s.charAt(i));
				value++;
				map.put(s.charAt(i), value);
			}
		}
		return map;
		
	}
	public static boolean isAnagram(String s, String t) {
		int[] a=new int[26];
        int[] b=new int[26];
        int i=0;
        while(s.charAt(i)!='\0'){
            a[s.charAt(i++)-'a']++;
        }
        i=0;
        while(t.charAt(i)!='\0'){
            b[t.charAt(i++)-'a']++;
        }
        for(i=0;i<26;i++){
            if(a[i]!=b[i]){
            	return false;
            }
        }
        return true;
	}*/
	public static void reverseString(char[] s) {
        int i=0,j=s.length-1;char tmp;
        while(j>i){
            tmp=s[j];
            s[j]=s[i];
            s[i]=tmp;
            j--;
            i++;
        }
        i=0;
        while(i<s.length){
        	System.out.println(s[i++]);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="ab";
		String t="cab";
		//System.out.println(isAnagram(s,t));
		reverseString(t.toCharArray());
		
	}

}
