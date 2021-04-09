package test;
//no.55
public class CanJump {
    public boolean canJump(int[] nums) {
    	int length = nums.length;
        int end = 0;
        int maxPosition = 0; 
        for(int i=0;i<length-1;i++){
        	maxPosition=Math.max(maxPosition, i+nums[i]);
        	if (i == end) {
        		if(end==maxPosition)return false;
        		if(maxPosition>=length-1)return true;
                end = maxPosition;
                
            }
        }
		return true;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,2,1,0,4};
		CanJump canJump =new CanJump();
		System.out.println(canJump.canJump(a));
	}

}
