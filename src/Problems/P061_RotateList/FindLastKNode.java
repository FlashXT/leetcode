package Problems.P061_RotateList;

import DataStructure.ListNode;

public class FindLastKNode {
    public static void main(String [] args){
        ListNode  dummy = new ListNode(-1);
        ListNode  head = new ListNode(1);
        ListNode  node1 = new ListNode(2);
        ListNode  node2 = new ListNode(3);
        ListNode  node3 = new ListNode(4);
        ListNode  node4 = new ListNode(5);
        dummy.next = head;
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode node =FindLastKNode(head,1);
        System.out.println(node.val);
    }
    public static  ListNode FindLastKNode(ListNode head,int k){
        ListNode slowptr = head,fastptr = head;
        for(int i = 0; i < k;i++){
            fastptr = fastptr.next;
        }
        //若要求倒数第K个结点的前一个结点,循环条件修改为fastptr.next!= null
        while(fastptr!= null){
            fastptr = fastptr.next;
            slowptr = slowptr.next;
        }
        return slowptr;
    }

}
