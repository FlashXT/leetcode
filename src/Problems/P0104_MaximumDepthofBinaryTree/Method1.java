package Problems.P0104_MaximumDepthofBinaryTree;

import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/24,11:19
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = 0,right = 0;
        if(root.left!=null)
            left = maxDepth(root.left);
        if(root.right!=null)
            right = maxDepth(root.right);
        return 1+Math.max(left,right);

    }
}
