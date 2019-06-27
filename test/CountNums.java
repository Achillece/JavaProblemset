package test;

public class CountNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[10];
		for(int i = 1;i <= 99;i++){
			int a = i;
			while(a!=0){
				nums[a%10]++;
				a/=10;
			}
		}
		for(int i=0;i<10;i++){
			System.out.print(nums[i]+"\0");
		}
	}

}
