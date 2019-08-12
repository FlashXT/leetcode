package Problems.P092_ReverseLinkedListII;

import DataStructure.ListNode;

public class Main {
    public static void main(String [] args){
        ListNode head =new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
//        node1.next=node2;
//        node2.next = node3;
//        node3.next = node4;
        ListNode nhead = new Method1().reverseBetween(head,1,2);
        while(nhead!=null){
            System.out.println(nhead.val);
            nhead = nhead.next;
        }

    }
}
