package Problems.P0108_ConvertSortedArraytoBinarySearchTree;

import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/25,8:59
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums = {-10,-3,0,5,9};
        TreeNode root = new Method2().sortedArrayToBST(nums);
        System.out.println(root.val);
    }
}
