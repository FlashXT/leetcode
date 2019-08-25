package Problems.P094_BinaryTreeInorderTraversal;

import DataStructure.TreeNode;

import java.util.Iterator;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/25,11:08
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums = {1,-1,2,-1,-1,3,-1};
        TreeNode root = BulidTree(nums,0);
        List<Integer> res = new Method3().inorderTraversal(root);
        Iterator<Integer> iter = res.iterator();
        while(iter.hasNext())
            System.out.print(iter.next()+"\t");
        System.out.println();
    }
    public static TreeNode BulidTree(int [] nums,int index){
        if(index >= nums.length || nums[index] == -1)
            return null;
        TreeNode root = new TreeNode(nums[index]);
        root.left = BulidTree(nums,index*2+1);
        root.right = BulidTree(nums,index*2+2);
        return root;
    }
}
