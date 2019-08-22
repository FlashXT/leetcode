package Problems.P082_RemoveDuplicatesfromSortedListII;

import DataStructure.ListNode;

public class Main {
    public static void main(String [] args){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        head.next = node1;node1.next = node2;
        node2.next = node3;node3.next = node4;
        node4.next = node5;

        new Method2().deleteDuplicates(head);
    }


}
