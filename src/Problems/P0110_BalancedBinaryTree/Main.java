package Problems.P0110_BalancedBinaryTree;

import DataStructure.Tree;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/25,10:16
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums = {1,2,3,4,5,6,7};
        Tree tree = new Tree(nums);
        boolean res = new Method1().isBalanced(tree.root);
        System.out.println(res);
    }
}
