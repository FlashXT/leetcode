package Problems.P0112_PathSum;

import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/24,10:42
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)return false;
        if(sum == root.val && root.left == null && root.right==null) return true;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
