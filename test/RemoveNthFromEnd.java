package test;
import test.ListNode;

public class RemoveNthFromEnd {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode r=head,l=head,pre=head;
		while(n>1){
			r=r.next;
			n--;
		}
		while(r.next!=null){
			pre=l;
			l=l.next;
			r=r.next;
		}
        if(l==head)head=head.next;
		pre.next=l.next;
        return head;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		ListNode q=head;
		for(int i=2;i<6;i++){
			q.next=new ListNode(i);
			q=q.next;
		}
		removeNthFromEnd(head,2);
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}
}
