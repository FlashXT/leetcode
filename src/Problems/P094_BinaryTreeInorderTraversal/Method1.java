package Problems.P094_BinaryTreeInorderTraversal;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/25,11:08
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    private List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inTraversal(root);
        return res;
    }
    private void inTraversal(TreeNode root) {
        if(root == null)
            return;
        inTraversal(root.left);
        res.add(root.val);
        inTraversal(root.right);
    }
}
