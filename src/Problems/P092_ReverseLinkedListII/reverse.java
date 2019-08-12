package Problems.P092_ReverseLinkedListII;

import DataStructure.ListNode;

public class reverse {
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode ptr = head;
        head = head.next;
        ListNode nhead = reverse(head);
        head.next = ptr;
        ptr.next=null;
        return nhead;
    }
}
