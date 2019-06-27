package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author song
 * @time 6/18
 */
public class LetterCombinations {
	static String[] number={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        resuce(list,digits,new StringBuilder());
		return list;
        
    }
	public static void resuce(List<String> list,String digits,StringBuilder prefix){
		if(prefix.length()==digits.length()){
			list.add(prefix.toString());
			return;
		}
		int cur=digits.charAt(prefix.length())-'0';
		char[] str=number[cur].toCharArray();
		for(char a:str){
			prefix.append(a);
			resuce(list,digits,prefix);
			prefix.deleteCharAt(prefix.length()-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="23";
		System.out.println(letterCombinations(a));
	}

}
