package test;
//no.263
public class IsUgly {
    public boolean isUgly(int n) {
    	boolean f;
    	do{
    		f=false;
    		if(n%2==0&&n!=0){n/=2;f=true;}
    		if(n%3==0&&n!=0){n/=3;f=true;}
    		if(n%5==0&&n!=0){n/=5;f=true;}
    	}while(f);
    	if(n==1)return true;
    	return f;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		IsUgly isUgly=new IsUgly();
		System.out.println(isUgly.isUgly(n));
	}

}
