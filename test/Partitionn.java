package test;

import java.util.ArrayList;
import java.util.List;

public class Partitionn {
	public static List<String> result=new ArrayList<>();
    public static List<List<String>> partition(String s) {
    	List<List<String>> record=new ArrayList<>();
        recursion(s,0,record);
        return record;
    }
    public static void recursion(String s,int first,List<List<String>> record){
        if(first==s.length()){
        	record.add(new ArrayList<>(result));
        	
        	return;
        }
        for(int i=first;i<s.length();i++){
            if(isPalindram(s,first,i)){
                result.add(s.substring(first,i+1));
                
                recursion(s,i+1,record);
                result.remove(result.size()-1);
               
            }
        }
    }
    private static boolean isPalindram(String s,int i,int j){
        while(j>i){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
	/*public static List<List<String>> partition(String s) {
		List<List<String>> res = new ArrayList<>();
		backTrack(s.toCharArray(), 0, new ArrayList<>(), res);
		return res;
	    }
	    private static void backTrack(char[] s, int idx, List<String> cur, List<List<String>> res){
		if(idx == s.length){
		    res.add(new ArrayList<>(cur));
		    return;
		}
		for(int i = idx; i < s.length; i++){
		    if(isPalind(s, idx, i)){
	                cur.add(new String(s, idx, i-idx+1));
		        backTrack(s, i + 1, cur, res);
		        cur.remove(cur.size()-1);
	            }
		}
	    }
	    private static boolean isPalind(char[] s, int i, int j){
		while(i < j){
		    if(s[i++] != s[j--])
		        return false;
		}
		return true;
	    }*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="aab";
		List<List<String>> records=partition(test);
		System.out.println(records);
		//for(List<String> record:records){
		//	for(String recorl:record){
		//		System.out.print(recorl+",");
		//	}
		//	System.out.println("");
		//}
	}

}
