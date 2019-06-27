package test;


public class SearchMatrix {
	public static boolean searchMatrix(int[][] matrix, int target) {
		int m=matrix.length-1;
		if(m==0) return false;
        int n=0;int l=matrix[0].length;
        while(n<l&&m>=0){
            if(target==matrix[m][n]){
                return true;
            }else if(target>matrix[m][n]){
                n++;
            }else if(target<matrix[m][n]){
                m--;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={
				{1,   4,  7, 11, 15},
				{2,   5,  8, 12, 19},
				{3,   6,  9, 16, 22},
				{10, 13, 14, 17, 24},
				{18, 21, 23, 26, 30}
		};
		System.out.println(searchMatrix(matrix,20));
	}
}
