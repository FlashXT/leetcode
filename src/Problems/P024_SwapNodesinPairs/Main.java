package Problems.P024_SwapNodesinPairs;

import DataStructure.ListNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/11 12:29;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        head.next = node1; //node1.next = node2;//node2.next = node3;
        ListNode res = new Method1().swapPairs(head);
        System.out.println(res);

    }

}
