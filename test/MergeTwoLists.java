package test;
import test.ListNode;
public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null && l2==null) return null;
		ListNode r=new ListNode(0);
		ListNode re=r;
		while(l1!=null && l2!=null){
			if(l1.val<=l2.val){
				r.next=l1;
				l1=l1.next;
				r=r.next;
			}else{
				r.next=l2;
				l2=l2.next;
				r=r.next;
			}
		}
		if(l1==null){
			r.next=l2;
		}
		else{
			r.next=l1;
		}
		return re.next;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
