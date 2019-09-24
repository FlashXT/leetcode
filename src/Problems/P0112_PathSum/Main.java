package Problems.P0112_PathSum;

import DataStructure.Tree;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/24,10:42
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums = {5,4,8,11,-1,13,4,7,2,-1,-1,-1,1};
        Tree tree = new Tree(nums);
        boolean res = new Method2().hasPathSum(tree.root,22);
        System.out.println(res);
    }
}
