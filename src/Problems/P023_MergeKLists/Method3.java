package Problems.P023_MergeKLists;

import DataStructure.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/10 21:54;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//按列合并,引入堆
public class Method3 {
    public ListNode mergeKLists(ListNode[] lists){
        if(lists==null) return null;
        if(lists.length == 0) return null;
        Comparator<ListNode> cmp = new Comparator<ListNode>(){
            @Override
            public int compare(ListNode n1,ListNode n2){
                return n1.val - n2.val;
            }
        };
        PriorityQueue<ListNode> heap = new PriorityQueue<>(cmp);

        ListNode head = new ListNode(-1),ptr = head;

        for(int i=0;i < lists.length;i++){
            if (lists[i]!=null)
                heap.add(lists[i]);
        }
        while(!heap.isEmpty()){
            ptr.next = heap.poll();
            ptr = ptr.next;
            if (ptr.next!= null)
                heap.offer(ptr.next);
        }
        return head.next;
    }


}
