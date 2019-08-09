package Problems.P083_RemoveDuplicatesfromSortedList;

import DataStructure.ListNode;

public class Main {
    public static void main(String [] args){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        head.next = node1;node1.next = node2;

        new Method1().deleteDuplicates(head);
    }


}
