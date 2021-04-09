package test;

public class SearchMatrix1 {
    public boolean searchMatrix(int[][] matrix, int target) {
    	int m=matrix.length;
    	int n=matrix[0].length;
    	int l=0;int r=m*n-1;
    	while(l<=r){
    		int mid=(l+r)/2;
    		if(target==matrix[mid/n][mid%n]){
    			return true;
    		}else if(target<matrix[mid/n][mid%n]){
    			r=mid-1;
    		}else{
    			l=mid+1;
    		}
    	}
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={
				{1,  3, 5, 7},
				{10,11,16,20},
				{23,30,34,60}
		};
		SearchMatrix1 search = new SearchMatrix1();
		System.out.println(search.searchMatrix(matrix, 3));
	}

}
