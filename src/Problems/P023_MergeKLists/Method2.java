package Problems.P023_MergeKLists;

import DataStructure.ListNode;
import org.omg.PortableInterceptor.INACTIVE;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/10 21:54;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//按列合并
public class Method2 {
    public ListNode mergeKLists(ListNode[] lists){
        if(lists==null) return null;
        ListNode head = new ListNode(-1),ptr = head;
        while(true){
            //标记是否遍历完所有链表
            boolean istraveAll = true;
            int min = Integer.MAX_VALUE;
            int min_index = -1;
            for(int i=0;i <lists.length;i++){
               if(lists[i]!= null){
                   if(lists[i].val < min){
                       min_index = i;
                       min = lists[i].val;
                   }
                   istraveAll = false;
               }

            }
            if(istraveAll)
                break;
            ptr.next = lists[min_index];
            ptr = ptr.next;
            lists[min_index] = lists[min_index].next;
        }
        ptr.next = null;
        return head.next;
    }


}
