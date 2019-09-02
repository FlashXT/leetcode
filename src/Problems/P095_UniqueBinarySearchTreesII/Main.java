package Problems.P095_UniqueBinarySearchTreesII;

import DataStructure.Tree;
import DataStructure.TreeNode;

import java.util.Iterator;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/26,10:11
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//https://leetcode.wang/leetCode-95-Unique-Binary-Search-TreesII.html
public class Main {
    public static void main(String [] args){

        List<TreeNode> res = new Method2().generateTrees(3);
        Iterator<TreeNode> iter = res.iterator();
        while(iter.hasNext()){
            new Tree().posTraveral(iter.next());
        }


    }
}
