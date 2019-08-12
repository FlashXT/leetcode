package Problems.P092_ReverseLinkedListII;

import DataStructure.ListNode;

public class Method1 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        //链表问题一定要考虑添加头结点！！！
        ListNode dummy = new ListNode(-1);dummy.next = head;
        ListNode ptr = dummy,ptr1=dummy,ptr2=dummy;
        int i = 0;
        while(i < n){
           if(i < m)
                ptr = ptr1;
           ptr2 = ptr1;
           ptr1 = ptr1.next;
           if(i >= m){
               ptr2.next = ptr1.next;
               ptr1.next = ptr.next;
               ptr.next = ptr1;
               ptr1 = ptr2;
           }
           i++;
        }
        return dummy.next;
    }

}
