package test;

public class Roman {
    public static String intToRoman(int num) {
    	String result=new String();
    	int power=1;
        while(num!=0){
            result=procedure(num%10,power)+result;
            num=num/10;
            power*=10;
        }
        return result;
    }
    public static String procedure(int num,int power){
        String result=new String();
        if(num==4||num==9){
        	if(power==1)
        		return (num==4)?"IV":"IX";
        	else if(power==10)
        		return (num==4)?"XL":"XC";
        	else if(power==100)
        		return (num==4)?"CD":"CM";
        }else if(num/5==1){
        	if(power==1)
        		result="V";
        	else if(power==10)
        		result="L";
        	else if(power==100)
        		result="D";
        }
        num=num%5;
    	while(num--!=0){
    		if(power==1)
    			result+="I";
    		else if(power==10)
    			result+="X";
    		else if(power==100)
    			result+="C";
    		else if(power==1000)
    			result+="M";
    	}
        return result;
    }
    public static int romanToInt(String s) {
        int result=0;
        s=s.replace("IV","A");
        s=s.replace("IX","B");
        s=s.replace("XL","E");
        s=s.replace("XC","F");
        s=s.replace("CD","G");
        s=s.replace("CM","H");
        for(int i=0;i<s.length();i++){
            result+=procedure(s.charAt(i));
        }
        return result;
    }
    public static int procedure(char n){
        if(n=='I') 
        	return 1;
        else if(n=='V') 
        	return 5;
        else if(n=='X') 
        	return 10;
        else if(n=='L') 
        	return 50;
        else if(n=='C') 
        	return 100;
        else if(n=='D') 
        	return 500;
        else if(n=='M') 
        	return 1000;
        else if(n=='A') 
        	return 4;
        else if(n=='B') 
        	return 9;
        else if(n=='E') 
        	return 40;
        else if(n=='F') 
        	return 90;
        else if(n=='G') 
        	return 400;
        else if(n=='H') 
        	return 900;
		return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt(intToRoman(546)));
	}

}
