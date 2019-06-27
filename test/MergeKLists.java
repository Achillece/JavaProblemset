package test;
/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;*/

import test.ListNode;
public class MergeKLists {
	 /*public ListNode mergeKLists(ListNode[] lists) {
		List<Integer> array=new ArrayList<>();
		for(ListNode list:lists){
			while(list!=null){
				array.add(list.val);
				list=list.next;
			}
		}
		Collections.sort(array);
		ListNode dummy=new ListNode(0);
		ListNode p=dummy;
		for(int a:array){
			p.next=new ListNode(a);
			p=p.next;
		}
		
		return dummy.next;
		    
	 }*/
	public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int left, int right) {
        if (left == right) return lists[left];
        int mid = left + (right - left) / 2;
        ListNode l1 = merge(lists, left, mid);
        ListNode l2 = merge(lists, mid + 1, right);
        return mergeTwoLists(l1, l2);
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
