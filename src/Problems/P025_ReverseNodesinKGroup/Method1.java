package Problems.P025_ReverseNodesinKGroup;

import DataStructure.ListNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/11 12:54;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public ListNode reverseKGroup(ListNode head, int k) {
        int len = 0;
        ListNode ptr = head;
        while(ptr!=null){
            len++;
            ptr = ptr.next;
        }
        head = reverseKListNode(head,k);
        ptr = head;

        for(int i = 1; i < len;i++){
            ptr = ptr.next;
            if((i+1)%k == 0 )
                ptr.next = reverseKListNode(ptr.next,k);
        }
        return head;

    }
    public ListNode reverseKListNode(ListNode head, int k){
        if(head == null || k ==1) return head;
        int len = 0;
        ListNode ptr = head,end=head;
        while(end!=null){
            len++;
            end = end.next;
        }
        if(len < k) return head;
        for(int i = 1;i<k;i++){
            ptr = ptr.next;
        }
        end = ptr;
        ptr = ptr.next;
        end.next = null;
        head = reverseList(head);
        end = head;
        while(end.next!=null)
            end = end.next;
        end.next = ptr;
        return head;

    }
    public ListNode reverseList(ListNode node1){
        if(node1.next == null)
            return node1;
        ListNode head = reverseList(node1.next);
        ListNode node2 = node1.next;
        node2.next = node1;
        node1.next = null;
        return head;
    }
}
