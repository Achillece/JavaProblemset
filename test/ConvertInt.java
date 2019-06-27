package test;

import java.math.BigInteger;

public class ConvertInt {
    public static int myAtoi(String str) {
    	 str=str.trim();
    	 int result=0;
         if(str.length()==0) return 0;
         char f=str.charAt(0);
         if(f=='-'||f=='+'||(f>='0'&&f<='9')){
             int a=1;
             while(a<str.length()&&str.charAt(a)>='0'&&str.charAt(a)<='9'){
                 a++;
             }
             str=str.substring(0,a);
             try{
            	 BigInteger r=new BigInteger(str);
            	 if(r.compareTo(new BigInteger(Integer.MIN_VALUE+""))<0
            			 ||r.compareTo(new BigInteger(Integer.MAX_VALUE+""))>0){
                     return (r.compareTo(new BigInteger(0+""))<0)?Integer.MIN_VALUE:Integer.MAX_VALUE;
                 }
                 result=Integer.parseInt(str);
                 return result;
             }catch(Exception e){
            	 return 0;
             }
         }
         else
             return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="20000000000000000000";
		System.out.println(myAtoi(a));
	}

}
