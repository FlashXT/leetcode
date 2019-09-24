package Problems.P0103_BinaryTreeZigzagLevelOrderTraversal;

import DataStructure.Tree;
import DataStructure.TreeNode;
import Problems.P037_SudokuSolver.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/28,9:58
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode tlast = root,nlast = root;
        int level = 0;
        ArrayList<Integer> levelNodes = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.left!=null){
                queue.offer(temp.left);
                nlast = temp.left;
            }
            if(temp.right!=null){
                queue.offer(temp.right);
                nlast = temp.right;
            }
            if((level&1) == 0)
                levelNodes.add(temp.val);
            else
                levelNodes.add(0,temp.val);
            if(temp == tlast){
                tlast = nlast;
                res.add(new ArrayList<>(levelNodes));
                levelNodes.clear();
                level++;
            }

        }
        return res;
    }
}
