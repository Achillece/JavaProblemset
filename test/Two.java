package test;
class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
public class Two {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
	    ListNode p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.val : 0;
	        int y = (q != null) ? q.val : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new ListNode(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new ListNode(carry);
	    }
	    return dummyHead.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={9};
		int[] b={1,9,9,9,9,9,9,9,9,9};
		ListNode l1=new ListNode(a[a.length-1]);
		ListNode l2=new ListNode(b[b.length-1]);
		for(int i=a.length-2;i>=0;i--){
			ListNode first=new ListNode(a[i]);
			first.next=l1;
			l1=first;
		}
		for(int i=b.length-2;i>=0;i--){
			ListNode first=new ListNode(b[i]);
			first.next=l2;
			l2=first;
		}
		
		Two p=new Two();
		ListNode result=p.addTwoNumbers(l1, l2);
		while(result!=null){
			System.out.println(result.val);
			result=result.next;
		}
	}

}
