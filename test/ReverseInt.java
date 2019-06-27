package test;

public class ReverseInt {
    public static int reverse(int x) {
    	if(x==0) return x;
    	 try{
             while(x%10==0) x/=10;
             StringBuilder a=new StringBuilder(Math.abs(x)+"");
             if(x<0) return -Integer.parseInt(a.reverse().toString());
             else return Integer.parseInt(a.reverse().toString());
         }catch(Exception e){
             return 0;
         }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		
		System.out.println(reverse(a));
	}

}
