package test;

public class Sorts {
	public static int[] InsertSort(int[] nums){
		for(int i=1;i<nums.length;i++){
			int mark=nums[i];
			int m;
			for(m=i-1;m>=0&&nums[m]>mark;m--){
				nums[m+1]=nums[m];
			}
			nums[m+1]=mark;
		}
		return nums;
	}
	public static int[] BubbleSort(int[] nums){
		boolean needNextPass=true;
		for(int k=1;k<nums.length&&needNextPass;k++){
			needNextPass=false;
			for(int i=0;i<nums.length-k;i++){
				if(nums[i]>nums[i+1]){
					int temp=nums[i];
					nums[i]=nums[i+1];
					nums[i+1]=temp;
					needNextPass=true;
				}
			}
		}
		return nums;
	}
	public static void MergeSort(int[] nums){
		int len=nums.length;
		if(len>1){
			int[] firstHalf=new int[len/2];
			System.arraycopy(nums, 0, firstHalf, 0, len/2);
			MergeSort(firstHalf);
			
			int[] secondHalf=new int[len-len/2];
			System.arraycopy(nums, len/2, secondHalf, 0, secondHalf.length);
			MergeSort(secondHalf);
			merge(firstHalf,secondHalf,nums);
		}
	}
	public static void merge(int[] first,int[] second,int[] temp){
		int a=0,b=0,c=0;
		while(a<first.length&&b<second.length){
			temp[c++]=(first[a]>second[b])?second[b++]:first[a++];
		}
		while(a<first.length){
			temp[c++]=first[a++];
			}
		while(b<second.length){
			temp[c++]=second[b++];
			}
	}
	public static void QuickSort(int[] nums){
		QuickSort(nums,0,nums.length-1);
	}
	public static void QuickSort(int[] nums,int first,int last){
		if(last>first){
			int pivotIndex=partition(nums,first,last);
			QuickSort(nums,first,pivotIndex-1);
			QuickSort(nums,pivotIndex+1,last);
		}
	}
	public static int partition(int[] nums,int first,int last){
		int pivot=nums[first];
		int low=first+1;
		int high=last;
		while(high>low){
			while(low<=high&&nums[low]<=pivot)low++;
			while(low<=high&&nums[high]>pivot)high--;
			if(high>low){
				int temp=nums[high];
				nums[high]=nums[low];
				nums[low]=temp;
			}
		}
		while(high>first&&nums[high]>=pivot)high--;
		if(pivot>nums[high]){
			nums[first]=nums[high];
			nums[high]=pivot;
			return high;
		}else{
			return first;
		}
	}
	class Heap<E extends Comparable<E>>{
		private java.util.ArrayList<E> list=new java.util.ArrayList<>();
		public Heap(){}
		public Heap(E[] objects){
			for(int i=0;i<objects.length;i++){
				add(objects[i]);
			}
		}
		public void add(E newObject){
			list.add(newObject);
			int currentIndex=list.size()-1;
			while(currentIndex>0){
				int parentIndex=(currentIndex-1)/2;
				if(list.get(currentIndex).compareTo(list.get(parentIndex))>0){
					E temp=list.get(currentIndex);
					list.set(currentIndex, list.get(parentIndex));
					list.set(parentIndex, temp);
				}else
					break;
				currentIndex=parentIndex;
			}
		}
		public E remove(){
			if(list.size()==0) return null;
			E removeObject=list.get(0);
			list.set(0, list.get(list.size()-1));
			list.remove(list.size()-1);
			int currentIndex=0;
			while(currentIndex<list.size()){
				int leftChildIndex=2*currentIndex+1;
				int rightChildIndex=2*currentIndex+2;
				if(leftChildIndex>=list.size()) break;
				int maxIndex=leftChildIndex;
				if(rightChildIndex<list.size()){
					if(list.get(maxIndex).compareTo(list.get(rightChildIndex))<0){
						maxIndex=rightChildIndex;
					}
				}
				if(list.get(currentIndex).compareTo(list.get(maxIndex))<0){
					E temp=list.get(maxIndex);
					list.set(maxIndex,list.get(currentIndex));
					list.set(currentIndex, temp);
					currentIndex=maxIndex;
				}else
					break;
			}
			return removeObject;
		}
	}
	public static <E extends Comparable<E>> void HeapSort(E[] nums){
		Sorts sort=new Sorts();
		Heap<E> heap=sort.new Heap<>();
		for(int i=0;i<nums.length;i++){
			heap.add(nums[i]);
		}
		for(int i=nums.length-1;i>=0;i--){
			nums[i]=heap.remove();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={12,3,41,12,34,2,3,9,0,54,13,-1,-2,32,-21,-2};
		//InsertSort(nums);
		//BubbleSort(nums);
		//MergeSort(nums);
		//QuickSort(nums);
		//HeapSort(nums);
		for(int num:nums){
			System.out.print(num+" ");
		}
	}

}
