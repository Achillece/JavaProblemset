package test;
import test.ListNode;
public class SwapPairs {
	public ListNode swapPairs(ListNode head) {
		return resuce(head, head.next);
    }
    private ListNode resuce(ListNode first,ListNode second){
        if(first==null||second==null)return first;
        first.next=second.next;
        second.next=first;
        if(first.next!=null)first.next=resuce(first.next, first.next.next);
        else return second;
		return second;
    }
}
