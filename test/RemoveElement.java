package test;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
    	if(nums.length==0)return 0;
    	int n=-1;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]==val){
    			if(n==-1)n=i;
    		}else if(n!=-1){
    			nums[n]=nums[i];
    			n++;
    		}
    	}
    	if(n==-1)return nums.length;
		return n;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1};
		int n=removeElement(nums,1);
		System.out.println(n);
		for(int i=0;i<n;i++){
			System.out.println(nums[i]);
		}
	}

}
