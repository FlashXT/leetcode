package Problems.P098_ValidateBinarySearchTree;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/26,20:53
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    //使用中序遍历，判断中序遍历是否严格升序
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        TreeNode temp = root;
        while(!stack.isEmpty()||temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp = temp.left;

            }else{
                temp = stack.pop();
//                System.out.println(temp.val);
                if(!res.isEmpty()){
                    if(temp.val <= res.get(res.size()-1))
                        return false;
                }
                res.add(temp.val);
                temp = temp.right;
            }
        }

        return true;
    }

}
