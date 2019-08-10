package Problems.P086_PartitionList;

import DataStructure.ListNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date: 2019/8/9 22:13
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {

    public ListNode partition(ListNode head, int x) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode ptr = dummy,cur = head,tail=dummy,ptr2 = tail;
        while(tail.next!=null){
            tail = tail.next;
        }
        ptr2 = tail;

        while(cur!=null && cur!=tail){
            if(cur.val >= x){
                ptr.next = cur.next;
                ptr2.next =cur;
                cur.next=null;
                cur = ptr;
                ptr2 = ptr2.next;
            }
            else
                ptr = cur;

            cur = cur.next;

        }
        if(cur!=null &&cur.next!=null && cur.val >= x){
            ptr.next = cur.next;
            ptr2.next = cur;
            cur.next = null;
            ptr2 = ptr2.next;
        }
        return dummy.next;
    }

}
