package Problems.P0109_ConvertSortedListtoBinarySearchTree;

import DataStructure.ListNode;
import DataStructure.Tree;
import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/25,9:33
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        ListNode head = new ListNode(-10);
        ListNode n1 = new ListNode(-3); head.next = n1;
        ListNode n2 = new ListNode(0);  n1.next = n2;
        ListNode n3 = new ListNode(5);  n2.next = n3;
        ListNode n4 = new ListNode(9);  n3.next = n4;

        TreeNode root = new Method1().sortedListToBST(head);
        System.out.println(root.val);
    }
}
