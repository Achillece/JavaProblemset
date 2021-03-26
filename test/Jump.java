package test;

public class Jump {
	public static int jump(int[] nums) {
		int length = nums.length;
        int end = 0;
        int maxPosition = 0; 
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]); 
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,3,1,1,4};
		System.out.println(jump(a));
		
	}

}
