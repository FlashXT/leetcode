package Problems.P019_RemoveNthNodeFromEndofList;

import DataStructure.ListNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/10 9:00;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //添加一个头结点，对应要删除head的情况
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int i = 0;
        ListNode ptr1 = dummy,ptr2 = dummy;
        while(i <= n){
            ptr1 = ptr1.next;
            i++;
        }

        while(ptr1!= null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        ptr2.next = ptr2.next.next;
        return dummy.next;
    }
}
