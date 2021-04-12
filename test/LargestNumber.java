package test;
//no.179
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	static String max=0+"";
    public String largestNumber(int[] nums) {
    	if(nums.length==1)return nums[0]+"";
    	boolean[] flag=new boolean[nums.length];
    	getMax(nums, flag, 0, "");
		return max;

    }
    private void getMax(int[] nums,boolean[] flag,int deep,String temp){
    	if(deep==nums.length){
    		 max=new BigDecimal(max).compareTo(new BigDecimal(temp))==1?max:temp;
    		 return;
    	}
    	for(int i=0;i<nums.length;i++){
    		if(flag[i])continue;
    		temp+=nums[i];
    		flag[i]=true;
    		getMax(nums, flag, deep+1, temp);
    		flag[i]=false;
    		temp=temp.substring(0, temp.length()-(nums[i]+"").length());
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,30,34,5,9};
		//LargestNumber largestNumber=new LargestNumber();
		//System.out.println(largestNumber.largestNumber(a));
		String[] strArr = new String[a.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = String.valueOf(a[i]);
        }
		Arrays.sort(strArr,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println(Arrays.toString(strArr));
				// TODO Auto-generated method stub
				return (o2 + o1).compareTo((o1 + o2));
			}
			
		});
		System.out.println(Arrays.toString(strArr));
		//Arrays.stream(strArr).forEach(System.out::print);
	}

}
