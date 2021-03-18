package test;


public class FirstMissingPositive {
	public static int firstMissingPositive(int[] nums) {
		/*int len = nums.length;
		int l=0,r=len,min=1,mid = 0;
		if(len==0)return min;
		Arrays.sort(nums);
		while(l<=r){
			mid=(l+r)/2;
			if(nums[mid]>0){
				r=mid-1;
			}else{
				l=mid+1;
			}
		}
		System.out.println(l+"-"+mid+"-"+r);
		for(int i=l;i<len;i++){
			if(nums[i]==min){
				min++;
				continue;
			}else{
				return min--;
			}
		}
		return min;*/
		int len = nums.length;
        int[] a = new int[len+1];
        for(int i=0;i<len;i++){
            if(nums[i]>0&&nums[i]<len+1){
                a[nums[i]]=nums[i];
            }
        }
        for(int i=1;i<len+1;i++){
            if(a[i]>0)continue;
            else return i;
        }
		return len+1;
     
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-1,-2,-3};
		//int[] a = {1,2,3};
		//int[] a = {1,7,8,9,10,11};
		System.out.println(firstMissingPositive(a));
	}

}
