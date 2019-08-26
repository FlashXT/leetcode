package Problems.P099_RecoverBinarySearchTree;

import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/26,21:34
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public void recoverTree(TreeNode root) {
        if(root == null)
            return ;

        //寻找L型结构，左孩子的最右孩子或右孩子的最左孩子
        TreeNode pre = root;
        if(root.left != null) {
            boolean flag = false;
            while(!flag){
                TreeNode ptr = root.left;
                while(ptr != null || ptr.val > root.val){
                    pre = ptr;
                    ptr = ptr.right;
                }
                if(pre == root) pre = ptr;
                if(pre.val >= root.val){
                    int temp = root.val;
                    root.val = pre.val;
                    pre.val = temp;
                }else{
                    flag = true;
                }
            }

        }

        if(root.right != null){

            TreeNode ptr = root.right;
            while(ptr != null||ptr.val < root.val){
                pre = ptr;
                ptr = ptr.left;
            }
            if(pre == root) pre = ptr;
            if(pre.val <= root.val){
                int temp = root.val;
                root.val = pre.val;
                pre.val = temp;
                return;
            }
        }
        recoverTree(root.left);
        recoverTree(root.right);
    }
}
