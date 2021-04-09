package test;
//no.62
public class UniquePaths {
    public int uniquePaths(int m, int n) {
    	int[][] a=new int[m+1][n+1];
    	for(int i=1;i<m+1;i++){
    		a[i][1]=1;
    	}
    	for(int i=1;i<n+1;i++){
    		a[1][i]=1;
    	}
    	for(int i=2;i<m+1;i++){
    		for(int j=2;j<n+1;j++){
    			a[i][j]=a[i-1][j]+a[i][j-1];
    		}
    	}
    	return a[m][n];	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniquePaths uniquePaths=new UniquePaths();
		System.out.println(uniquePaths.uniquePaths(3, 7));
	}

}
