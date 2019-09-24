package Problems.P0111_MinimumDepthOfBinaryTree;

import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/24,10:14
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        int left = Integer.MAX_VALUE;

        if(root.left!=null){
            left = minDepth(root.left);
        }
        int right = Integer.MAX_VALUE;
        if(root.right!=null)
            right = minDepth(root.right);
        return Math.min(left,right)+1;

    }
}
