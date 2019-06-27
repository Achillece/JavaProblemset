package test;

import java.util.Stack;

public class Isvalid {
    public static boolean isValid(String s) {
    	Stack<Character> stack=new Stack<>();
    	int i=0;
    	while(i<s.length()){
    		if(!stack.isEmpty()&&(
    				(stack.peek()=='(' && s.charAt(i)==')')||
    				(stack.peek()=='[' && s.charAt(i)==']')||
    				(stack.peek()=='{' && s.charAt(i)=='}')))
    			stack.pop();
    		else stack.push(s.charAt(i));
    		i++;
    	}
    	if(stack.isEmpty()) return true;
    	else return false;
    }
	/*public static boolean isValid(String s) {
		while(s.contains("{}")||s.contains("()")||s.contains("[]")){
			s.replaceAll("()", "");
			s.replaceAll("[]", "");
			s.replaceAll("{}", "");
		}
		return s=="";
	}*/
	public static void main(String[] args){
		String input="";
		System.out.println(isValid(input));
	}
}
