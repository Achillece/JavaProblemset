package test;

public class MyPow {
    public double myPow(double x, int n) {
		return n<0?1.0/multiply(x, -(long)n):multiply(x, (long)n);

    }
    private double multiply(double x, long n){
    	if(n==0){
    		return 1.0;
    	}
    	double y = multiply(x, n/2);
    	return n%2==0?y*y:y*y*x;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPow pow=new MyPow();
		System.out.println(pow.myPow(2.100, -3));
	}

}
