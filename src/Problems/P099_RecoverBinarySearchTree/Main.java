package Problems.P099_RecoverBinarySearchTree;

import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/26,21:34
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums = {1,3,-1,-1,2};
        TreeNode root = BulidTree(nums,0);
        new Method1().recoverTree(root);
        System.out.println(root.val);

    }
    public static TreeNode BulidTree(int [] nums,int index){
        if (index >= nums.length || nums[index]== -1)
            return null;
        TreeNode root = new TreeNode(nums[index]);
        root.left = BulidTree(nums,index*2+1);
        root.right = BulidTree(nums,index*2+2);
        return root;
    }
}
