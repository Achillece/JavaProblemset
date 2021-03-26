package test;

public class Trap {
    public static int trap(int[] height) {
    	int l=0,r=height.length-1,res=0;
    	while(l<r){
    		while(height[l]<1&&l<r)l++;
    		while(height[r]<1&&l<r)r--;
    		if(l>=r)break;
    		for(int i=l;i<=r;i++){
    			height[i]--;
    		}
    	}
    	for(int i=0;i<height.length;i++){
    		if(height[i]<0)res+=height[i];
    	}
		return -res;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
		//0,-1,1,0,-1,0,2,1,0,1,0
		//-1,0,-1,-2,-1,1,0,-1,0
		int[] a = {2,0,2};
		System.out.println(trap(a));
	}

}
