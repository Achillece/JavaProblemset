package test;
import struct.ListNode;
public class ReverseKGroup {
	public static ListNode reverseKGroup(ListNode head, int k) {
		int n=k;
		ListNode p=head,end=null;
		while(p!=null&&n!=0){
			end=p;
			p=p.next;
			n--;
		}
		if(n!=0)return head;
		end.next=reverseKGroup(end.next, k);
		while(head!=end){
			p=head;
			head=head.next;
			p.next=end.next;
			end.next=p;
		}
		return end;
    }
	public static void main(String[] args){
		ListNode head=new ListNode(1);
		ListNode p=head;
		for(int i=2;i<6;i++){
			p.next=new ListNode(i);
			p=p.next;
		}
		head=reverseKGroup(head,2);
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}
}
