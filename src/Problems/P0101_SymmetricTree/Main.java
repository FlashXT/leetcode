package Problems.P0101_SymmetricTree;

import DataStructure.Tree;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/28,9:13
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums = {1,2,3,4,5,7};
        Tree tree = new Tree(nums);
        tree.preTraversal();
        System.out.println(new Method1().isSymmetric(tree.root));

    }

}
