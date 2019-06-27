package test;

import java.util.ArrayList;

public class Calculate {
	 public static int calculate(String s) {
	        ArrayList<Character> operater=new ArrayList<>();
	        ArrayList<Integer> number=new ArrayList<>();
	        s=s.replace(" ","");
	        int i=0;
	        while(i<s.length()){
	        	if(Character.isDigit(s.charAt(i))){
	                int tmp=Integer.parseInt(s.charAt(i)+"");
	                i++;
	                while(i<s.length()&&Character.isDigit(s.charAt(i))){
	                    tmp=10*tmp+Integer.parseInt(s.charAt(i)+"");
	                    i++;
	                }i--;
	                number.add(tmp);
	            }else{
	            	if(s.charAt(i)=='*'){
	            		int tmp=number.get(number.size()-1)*Integer.parseInt(s.charAt(i+1)+"");
	            		number.remove(number.size()-1);
	            		number.add(tmp);
	            		 
	            		 i=i+2;
	            		 continue;
	            	}
	            	if(s.charAt(i)=='/'){
	            		int tmp=number.get(number.size()-1)/Integer.parseInt(s.charAt(i+1)+"");
	            		number.remove(number.size()-1);
	            		number.add(tmp);
	            		
	            		 i=i+2;
	            		 continue;
	            	}else{
	            		operater.add(s.charAt(i));
	            	}
	            }
	            	i++;
	        }
	        while(operater.size()>0){
	        	int tmp1=number.get(number.size()-1);
	        	number.remove(number.size()-1);
	        	int tmp2=number.get(number.size()-1);
	        	number.remove(number.size()-1);
	        	if(operater.get(operater.size()-1)=='+'){
	        		int tmp=tmp2+tmp1;
	        		number.add(tmp);
	        	}
	        	if(operater.get(operater.size()-1)=='-'){
	        		int tmp=tmp2-tmp1;
	        		number.add(tmp);
	        	}
	        	operater.remove(operater.size()-1);
	        }
	        return number.get(number.size()-1);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="  3+ 51*2  /2-4";
		int b=calculate(a);
		System.out.println(b);
	}

}
