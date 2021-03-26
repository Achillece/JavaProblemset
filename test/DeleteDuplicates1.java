package test;
import struct.ListNode;
public class DeleteDuplicates1 {
    public ListNode deleteDuplicates(ListNode head) {
    	if(head==null)return head;
        ListNode cur = head;
    	while(cur.next!=null){
    		if(cur.val==cur.next.val){
    			int temp=cur.val;
    			while(cur.next!=null&&cur.next.val==temp){
    				cur.next=cur.next.next;
    			}
    		}else{
    			cur=cur.next;
    		}
    	}
		return head;

    }
}
