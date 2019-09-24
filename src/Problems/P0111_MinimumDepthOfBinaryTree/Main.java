package Problems.P0111_MinimumDepthOfBinaryTree;

import DataStructure.Tree;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/24,10:13
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int[] nums = {1,2,3,4,5};
        Tree tree = new Tree(nums);
        int res = new Method1().minDepth(tree.root);
        System.out.println(res);
    }
}
