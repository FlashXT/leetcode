package Problems.P082_RemoveDuplicatesfromSortedListII;

import DataStructure.ListNode;

import java.util.ArrayList;
import java.util.List;
//在83题的基础上修改而来，83题将重复值的结点只保留一个；本题完全删除重复值的结点；
//① 使用83题的方法先将重复值的结点只保留一个，生成新的链表；
//② 同时保留重复出现的结点的值，然后从第一步的结果中删除这些结点；
public class Method1 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode dummy = new ListNode(Integer.MAX_VALUE);
        dummy.next = head;
        List<Integer> del = new ArrayList<>();
        ListNode ptr1 = dummy,ptr2 = dummy;
        while(ptr2.next!=null){
            if(ptr1.val == ptr2.val){

                del.add(ptr2.val);
                ptr2 = ptr2.next;
            }
            else{
                ptr1.next = ptr2;
                ptr1 = ptr2;
                ptr2 = ptr2.next;
            }
        }
        if(ptr1.val == ptr2.val){
            del.add(ptr2.val);
            ptr1.next=null;
        }
        else
            ptr1.next=ptr2;
        for(int i = 1; i< del.size();i++){
            delListNode(dummy,del.get(i));
        }
        return dummy.next;
    }
    public void delListNode(ListNode dummy,Integer delval){
        ListNode ptr1 = dummy,ptr2 = ptr1;
         while(ptr1!=null){
             if(ptr1.val == delval)
                 ptr2.next = ptr1.next;
             ptr2 = ptr1;
             ptr1 = ptr1.next;
         }
    }
}
