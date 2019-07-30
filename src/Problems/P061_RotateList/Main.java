package Problems.P061_RotateList;

import DataStructure.ListNode;

public class Main {
    public static  void main(String [] args){
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
        ListNode node = new Method1().rotateRight(head,2);
        System.out.println(node.val);


    }
}
