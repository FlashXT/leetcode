package Problems.P025_ReverseNodesinKGroup;

import DataStructure.ListNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/11 12:54;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
/*
    Given a linked list, reverse the nodes of a linked list k at a time and
    return its modified list.

    k is a positive integer and is less than or equal to the length of the linked list.
    If the number of nodes is not a multiple of k then left-out nodes in the end should
    remain as it is.

    Example:

        Given this linked list: 1->2->3->4->5
            For k = 2, you should return: 2->1->4->3->5
            For k = 3, you should return: 3->2->1->4->5

    Note:

            Only constant extra memory is allowed.
            You may not alter the values in the list's nodes, only nodes itself may be changed.
 */
public class Main {
    public static void main(String [] args){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1; node1.next = node2;node2.next = node3;node3.next = node4;
        new Method1().reverseKGroup(head,2);

    }
}
