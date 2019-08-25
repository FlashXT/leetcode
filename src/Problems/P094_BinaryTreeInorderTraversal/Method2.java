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
public class Method2 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(temp!=null || !stack.isEmpty()){
            if(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                res.add(temp.val);
                temp = temp.right;
            }
        }
        return res;
    }

}
