package Problems.P099_RecoverBinarySearchTree;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/26,21:34
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//思路2:中序遍历
// 交换的位置的话就是两种情况:
//
//①相邻的两个数字交换
//[ 1 2 3 4 5 ] 中 2 和 3 进行交换，[ 1 3 2 4 5 ]，这样的话只产生一组逆序的数字
// （正常情况是从小到大排序，交换后产生了从大到小），3 2。
// 我们只需要遍历数组，找到后，把这一组的两个数字进行交换即可。
//
//②不相邻的两个数字交换
//[ 1 2 3 4 5 ] 中 2 和 5 进行交换，[ 1 5 3 4 2 ]，这样的话其实就是产生了两组逆序
// 的数字对。5 3 和 4 2。
// 所以我们只需要遍历数组，然后找到这两组逆序对，然后把第一组前一个数字和第二组后一个数字
// 进行交换即完成了还原。
public class Method2 {
    TreeNode first = null;
    TreeNode second = null;
    public void recoverTree(TreeNode root){
        midTravseal(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    public void midTravseal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        TreeNode pre = null;
        while(!stack.isEmpty() || temp!= null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
//               System.out.println();
                if (pre != null && temp.val < pre.val) {
                    if (first == null) {
                        first = pre;
                        second =  temp;
                    } else {
                        second =  temp;
                    }
                }
                pre = temp;
                temp = temp.right;
            }
        }
    }
}
