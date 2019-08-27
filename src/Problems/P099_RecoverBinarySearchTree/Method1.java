package Problems.P099_RecoverBinarySearchTree;

import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/26,21:34
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//
//考虑交换的位置的可能：
// ①根节点和左子树的某个数字交换 -> 由于根节点大于左子树中的所有数，所以交换后我们
//   只要找左子树中最大的那个数，就是所交换的那个数;
// ②根节点和右子树的某个数字交换 -> 由于根节点小于右子树中的所有数，所以交换后我们只
//   要在右子树中最小的那个数，就是所交换的那个数
// ③左子树和右子树的两个数字交换 -> 找左子树中最大的数，右子树中最小的数，即对应两个
//   交换的数
// ④左子树中的两个数字交换
// ⑤右子树中的两个数字交换
public class Method1 {
    public void recoverTree(TreeNode root) {
        if(root == null)
            return ;

        TreeNode leftmax = getLeftMax(root.left);
        TreeNode rightmin = getRightMin(root.right);
        if(leftmax !=null && rightmin != null){
            if(rightmin.val < leftmax.val){
                int temp = rightmin.val;
                rightmin.val = leftmax.val;
                leftmax.val = temp;
            }
        }
        if(leftmax != null && leftmax.val > root.val){
            int temp = root.val;
            root.val = leftmax.val;
            leftmax.val = temp;
        }
        if(rightmin != null && rightmin.val < root.val){
            int temp = root.val;
            root.val = rightmin.val;
            rightmin.val = temp;
        }

        recoverTree(root.left);
        recoverTree(root.right);
    }
    private TreeNode getLeftMax(TreeNode root){
        if(root == null)
            return root ;
        TreeNode leftmax = getLeftMax(root.left);
        TreeNode rightmax = getLeftMax(root.right);
        TreeNode max = root;
        if(leftmax != null && leftmax.val > max.val)
            max= leftmax;
        if(rightmax != null &&rightmax.val > max.val)
            max =rightmax;

        return max;
    }
    private TreeNode getRightMin(TreeNode root){
        if(root == null)
            return root ;
        TreeNode leftmin = getRightMin(root.left);
        TreeNode rightmin = getRightMin(root.right);
        TreeNode min = root;
        if(leftmin != null && leftmin.val < min.val)
            min = leftmin;
        if(rightmin != null &&rightmin.val < min.val)
            min =rightmin;
        return min;

    }
}
