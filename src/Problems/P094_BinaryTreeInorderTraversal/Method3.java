package Problems.P094_BinaryTreeInorderTraversal;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/25,11:08
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//线索化中序遍历
public class Method3 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode curr = root;
        TreeNode pre;
        while(curr!= null){
            if(curr.left == null){
                res.add(curr.val);
                curr = curr.right;
            }else{
                pre = curr.left;
                while(pre.right!=null)
                    pre = pre.right;
                pre.right = curr;
                TreeNode temp = curr;
                curr = curr.left;
                temp.left = null;
            }
        }
        return res;
    }

}
