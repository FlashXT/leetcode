package Problems.P002_AddTwoNumbers;

import DataStructure.ListNode;
import Problems.P001_TwoSum.Method1;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/25 19:31;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String[] args){
        ListNode l1 = new ListNode(5);
//        l1.next = new ListNode(8);
//        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
        ListNode res = Method0.addTwoNumbers(l1,l2);
        while(res!=null){
            System.out.print(res.val+"->");
            res = res.next;
        }


    }

}
