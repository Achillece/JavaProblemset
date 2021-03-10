package test;

import java.util.HashMap;

public class IsValidSudoku {
	@SuppressWarnings("unchecked")
	public static boolean isValidSudoku(char[][] board) {
		HashMap<Integer, Integer>[] rows=new HashMap[9];
		HashMap<Integer, Integer>[] cols=new HashMap[9];
		HashMap<Integer, Integer>[] blocks=new HashMap[9];
		for(int i=0;i<9;i++){
			rows[i]=new HashMap<Integer,Integer>();
			cols[i]=new HashMap<Integer,Integer>();
			blocks[i]=new HashMap<Integer,Integer>();
		}
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				char num=board[i][j];
				if(num!='.'){
					int n=(int)num;
					int block=(i / 3 ) * 3 + j / 3;
					
					rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
					cols[j].put(n, cols[j].getOrDefault(n, 0) + 1);
					blocks[block].put(n, blocks[block].getOrDefault(n, 0)+1);
					
					if(rows[i].get(n)>1 || cols[j].get(n)>1 || blocks[block].get(n)>1){
						return false;
					}
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] a = {
				{'8','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}
		};
		System.out.println(isValidSudoku(a));
	}

}
