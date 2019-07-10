package Problems.P021_MergeTwoSortedLists;

import DataStructure.ListNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/10 14:42;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode head = new ListNode(-1),ptr=head;
        while(ptr1!=null && ptr2 != null){
            if(ptr1.val < ptr2.val){
                ptr.next = ptr1;
                ptr = ptr1;
                ptr1 = ptr1.next;
            }
            else{
                ptr.next = ptr2;
                ptr = ptr2;
                ptr2 = ptr2.next;
            }
            ptr.next = null;

        }
        if(ptr1 != null) ptr.next = ptr1;
        else if(ptr2 != null) ptr.next = ptr2;
        return head.next;

    }
}
