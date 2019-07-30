package Problems.P061_RotateList;

import DataStructure.ListNode;

public class Method1 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k==0) return head;
        int len = 1;
        ListNode ptr = head;
        while(ptr.next!=null){
            ptr = ptr.next;
            len++;
        }
        if(k%len == 0) return head;
        ListNode temp = FindlastKNode(head,k%len);
        ListNode newhead = temp.next;
        temp.next = null;
        ptr.next = head;
        return newhead;
    }
    //求链表的倒数第k个结点的前一个结点
    public ListNode FindlastKNode(ListNode head, int k){
        ListNode ptr = head,ptr2 = head;
        for(int i = 0; i< k;i++){
            ptr = ptr.next;
        }
        while(ptr.next!=null){
            ptr2 = ptr2.next;
            ptr = ptr.next;
        }
        return ptr2;
    }
}
