package Problems.P0102_BinaryTreeLevelOrderTraversal;

import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/28,9:56
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        //last打印行的最右结点；nlast下一行的最右结点
        TreeNode last=root,nlast = root;
        queue.offer(root);
        TreeNode temp=root;

        while(!queue.isEmpty()&&temp!= null){
            temp = queue.remove();
            list.add(temp.val);
            if(temp.left != null){
                nlast = temp.left;
                queue.offer(temp.left);
            }
            if(temp.right != null){
                nlast = temp.right;
                queue.offer(temp.right);
            }
            if(temp == last){
                res.add(new ArrayList(list));
                list.clear();
                last = nlast;
            }

        }
        return res;
    }
}
