package test;

public class MaxArea {
    public static int maxArea(int[] height) {
    	int[] a=new int[height.length+2];
        for(int i=1;i<a.length-1;i++){
            a[i]=height[i-1];
        }
        int h=a.length-1,max=0;
        for(int i=1;i<h;i++){
            int first=0,last=h;
            while(a[first]<a[i]&&a[last]<a[i]){
                first++;last--;
                if(first>=i) first--;
                if(last<=i) last++;
                if(last+first==2*i) break;
            }
            int m=(a[first]<a[last])?last:first;
            max=Math.max(Math.min(a[i],a[m])*Math.abs(m-i),max);
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2};
		System.out.println(maxArea(a));
	}

}
