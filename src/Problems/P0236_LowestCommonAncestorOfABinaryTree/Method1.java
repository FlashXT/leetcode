package Problems.P0236_LowestCommonAncestorOfABinaryTree;

import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/24,9:01
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
            return null;
        if(root.val ==p.val|| root.val==q.val)
            return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null && right!=null)
            return root;
        return left==null?right:left;
    }
}
