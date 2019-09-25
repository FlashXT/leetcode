package Problems.P0107_BinaryTreeLevelOrderTraversalII;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/25,8:49
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode tlast = root,nlast = root;
        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.left!= null){
                queue.offer(temp.left);
                nlast = temp.left;
            }
            if(temp.right!=null){
                queue.offer(temp.right);
                nlast = temp.right;
            }
            list.add(temp.val);
            if(temp == tlast){
                tlast = nlast;
                res.add(0,new ArrayList<>(list));
                list.clear();
            }
        }
        return res;
    }
}
