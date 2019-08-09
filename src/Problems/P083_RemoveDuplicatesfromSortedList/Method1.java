package Problems.P083_RemoveDuplicatesfromSortedList;

import DataStructure.ListNode;

public class Method1 {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(Integer.MAX_VALUE);
        dummy.next = head;
        ListNode ptr1 = dummy,ptr2 = dummy;
        while(ptr2.next!=null){
            if(ptr1.val == ptr2.val){
               ptr2 = ptr2.next;
            }

            else{
                ptr1.next = ptr2;
                ptr1 = ptr2;
                ptr2 = ptr2.next;
            }
        }
        if(ptr1.val == ptr2.val)
            ptr1.next=null;
        else
            ptr1.next=ptr2;
        return dummy.next;
    }
}
