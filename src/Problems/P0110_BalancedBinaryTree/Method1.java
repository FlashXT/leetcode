package Problems.P0110_BalancedBinaryTree;

import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/25,10:17
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int diff = Math.abs(Depth(root.left)-Depth(root.right));
        if(diff <= 1)
            return isBalanced(root.left)&&isBalanced(root.right);
        else
            return false;

    }
    private int Depth(TreeNode root){
        if(root == null) return 0;

        int left = Depth(root.left);
        int right = Depth(root.right);
        return Math.max(left,right)+1;
    }
}
