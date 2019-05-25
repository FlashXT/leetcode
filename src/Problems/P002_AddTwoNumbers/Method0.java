package Problems.P002_AddTwoNumbers;

import DataStructure.ListNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/25 19:44;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method0 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null || l2 ==null)
            return l1==null ? l2:l1;
        ListNode p1 = l1,p2 = l2,p3 = l1;
        ListNode node = new ListNode(0);
        int sum = 0;
        while(p1!= null && p2!=null){
            sum= p1.val+p2.val+node.val;
            p1.val = sum%10;
            node.val = sum/10;
            p3 = p1;
            p1 = p1.next;
            p2 = p2.next;

        }
        if(p1 == null) {
            p3.next = p2;
            p1 = p3.next;
        }

        while(p1!= null && node.val!=0){
            sum = p1.val+node.val;
            p1.val = sum%10;
            node.val=sum/10;
            p3 = p1;
            p1 = p1.next;
        }

        if(node.val!= 0) p3.next = node;
        return l1;

    }
}
