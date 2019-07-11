package Problems.P024_SwapNodesinPairs;

import DataStructure.ListNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/11 12:29;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public ListNode swapPairs(ListNode head){
        if(head == null ||head.next == null)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode ptr = dummy,ptr1 = head,ptr2 = head.next;
        while(ptr2!= null){
            ptr.next = ptr2;
            ptr1.next = ptr2.next;
            ptr2.next = ptr1;
            ptr = ptr1;
            ptr1 = ptr1.next;
            if(ptr1!= null)
                ptr2 = ptr1.next;
            else
                ptr2 = null;
        }
        return dummy.next;

    }
}
