package Problems.P023_MergeKLists;

import DataStructure.ListNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/10 21:54;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//两两合并优化，使用归并排序的思想(循环版)https://leetcode.com/problems/merge-k-sorted-lists/
public class Method5 {
    public ListNode mergeKLists(ListNode[] lists){
        if(lists==null) return null;
        if(lists.length == 0) return null;
        int interval = 1;
        while(interval < lists.length){
            for(int i = 0; i + interval < lists.length;i=i+interval*2){
                lists[i] = mergeTwoLists(lists[i],lists[i+interval]);
            }
            interval*=2;
        }
        return lists[0];
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode head = new ListNode(-1),ptr=head;
        while(ptr1!=null && ptr2 != null){
            if(ptr1.val < ptr2.val){
                ptr.next = ptr1;
                ptr = ptr1;
                ptr1 = ptr1.next;
            }
            else{
                ptr.next = ptr2;
                ptr = ptr2;
                ptr2 = ptr2.next;
            }
            ptr.next = null;

        }
        if(ptr1 != null) ptr.next = ptr1;
        else if(ptr2 != null) ptr.next = ptr2;
        return head.next;

    }
}
