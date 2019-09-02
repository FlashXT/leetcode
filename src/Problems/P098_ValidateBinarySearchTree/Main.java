package Problems.P098_ValidateBinarySearchTree;

import DataStructure.Tree;
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
        Tree tree = new Tree(nums);
        boolean res = new Method1().isValidBST(tree.root);
        System.out.println(res);

    }

}
