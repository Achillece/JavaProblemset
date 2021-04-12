package test;
//no.160

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	ListNode a=headA;
    	while(a!=null){
    		ListNode b=headB;
    		while(b!=null){
    			if(a==b){return a;}
    			else{b=b.next;}
    		}
    		a=a.next;
    	}
		return null;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
