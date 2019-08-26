package Problems.P098_ValidateBinarySearchTree;

import DataStructure.TreeNode;

import java.math.BigInteger;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/26,20:53
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums = {3,2,4,1,-1,-1,5};
        TreeNode root = BulidTree(nums,0);
        boolean res = new Method1().isValidBST(root);
        System.out.println(res);

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
