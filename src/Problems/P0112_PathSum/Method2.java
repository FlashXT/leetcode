package Problems.P0112_PathSum;

import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/24,10:42
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//在方法1的基础上剪枝
public class Method2 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(sum == root.val && root.left==null && root.right==null)
            return true;
        boolean res = false;
        if(root.left!=null)
            res = hasPathSum(root.left,sum-root.val);
        if(!res && root.right!=null)
            res = hasPathSum(root.right,sum-root.val);
        return res;
    }
}
