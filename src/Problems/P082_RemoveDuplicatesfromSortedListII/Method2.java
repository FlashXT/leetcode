package Problems.P082_RemoveDuplicatesfromSortedListII;

import DataStructure.ListNode;

public class Method2 {
    public ListNode deleteDuplicates(ListNode head) {
        //处理链表问题先添加头结点
        ListNode dummy= new ListNode(-1);
        dummy.next = head;
        ListNode ptr = dummy;
        ListNode curr = head;
        boolean equal = false;
        while(curr!=null && curr.next != null){

            while(curr.next!=null && curr.val==curr.next.val){
                curr = curr.next;
                equal = true;
            }
            if(equal){
                ptr.next = curr.next;
                equal = false;
            }
            else
                ptr = curr;
            curr = curr.next;
        }
        return dummy.next;
    }
}
