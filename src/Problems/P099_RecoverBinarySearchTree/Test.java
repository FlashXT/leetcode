package Problems.P099_RecoverBinarySearchTree;

import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/26,21:34
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Test {
    public void recoverTree(TreeNode root) {
        if(root == null)
            return ;

        //寻找L型结构，左孩子的最右孩子或右孩子的最左孩子


        boolean flagL = false,flagR=false;
        while(!flagL || !flagR){

            if(!flagL){
                TreeNode leftmax = root;
                TreeNode ptr = root.left;
                while(ptr != null){
                    leftmax = leftmax.val < ptr.val ? ptr:leftmax;
                    ptr = ptr.right;
                }

                if(leftmax.val > root.val){
                    int temp = root.val;
                    root.val = leftmax.val;
                    leftmax.val = temp;
                    flagR = false;
                }
            }
            flagL = true;
            if(!flagR){
                TreeNode rightmin = root;
                TreeNode ptr = root.right;
                //寻找右边最小结点，由于违反了BST,所以L型结构没用
                while(ptr != null){
                    rightmin = rightmin.val > ptr.val ? ptr:rightmin;
                    ptr = ptr.left;
                }

                if(rightmin!=null && rightmin.val < root.val){
                    int temp = root.val;
                    root.val = rightmin.val;
                    rightmin.val = temp;
                    flagL = false;
                }
            }
            flagR = true;

        }
        recoverTree(root.left);
        recoverTree(root.right);
    }
}
