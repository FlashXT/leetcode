package Problems.P0109_ConvertSortedListtoBinarySearchTree;

import DataStructure.ListNode;
import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/25,9:33
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        int len = 0;
        ListNode ptr = head;
        while(ptr!=null){
            ptr = ptr.next;
            len++;
        }
        return sortedListToBST(head,len-1);
    }
    private TreeNode sortedListToBST(ListNode head,int len) {
        if(len < 0)
            return null;
        if(len == 0)
            return new TreeNode(head.val);
        ListNode ptr = head;
        int length = 0;
        while(length < len/2){
            ptr = ptr.next;
            length++;
        }
        TreeNode root = new TreeNode(ptr.val);
        root.left = sortedListToBST(head,length-1);
        root.right = sortedListToBST(ptr.next,len-length-1);
        return root;
    }
}
