package test;

import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

/**
 * @author song
 * @time 6/21
 */
public class GenerateParenthesis {
	/*static char[] parenthesis={'(',')'};
	public static List<String> generateParenthesis(int n) {
		Set<String> set=new HashSet<>();
		resurecursive(new StringBuilder(),set,n);
		List<String> list = new ArrayList<>(set);
		return list;
        
    }
	private static void resurecursive(StringBuilder str,Set<String> set,int n){
		if(str.length()==2*n){
			set.add(str.toString());
			return;
		}
		for(int i=0;i<=str.length();i++){
			str.insert(i,parenthesis);
			resurecursive(str,set,n);
			str.delete(i, i+2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateParenthesis(3));
		//
		
	}*/
	  List<String> res=new ArrayList<>();
	    public List<String> generateParenthesis(int n) {
	        if(n==0){
	            return res;
	        }
	        backTracing(0,0,"",n);
	        return res;
	    }
	    public void backTracing(int left,int right,String str,int n){
	        if(left==n&&right==n){
	            res.add(str);
	            return;
	        }
	        if(left<n){
	            backTracing(left+1,right,str+"(",n);
	        }
	        if(right<left){
	            backTracing(left,right+1,str+")",n);
	        }
	        
	    }
}
