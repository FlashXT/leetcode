package Problems.P086_PartitionList;

import DataStructure.ListNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date: 2019/8/9 22:13
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(5);
        head.next = node1;node1.next = node2;
        node2.next = node3;node3.next = node4;
        node4.next = node5;
        new Method1().partition(head,3);

    }
}
