package Problems.P0236_LowestCommonAncestorOfABinaryTree;

import DataStructure.Tree;
import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/24,9:00
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums = {3,5,1,6,2,0,8,-1,-1,7,4};
        Tree tree = new Tree(nums);
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(4);
        TreeNode res = new Method1().lowestCommonAncestor(tree.root,p,q);
        System.out.println(res.val);
    }
}
