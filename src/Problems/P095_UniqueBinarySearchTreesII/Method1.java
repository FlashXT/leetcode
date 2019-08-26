package Problems.P095_UniqueBinarySearchTreesII;

import DataStructure.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/26,10:12
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {

    public List<TreeNode> generateTrees(int n) {
        if(n == 0)
            return new ArrayList<TreeNode>();
        return BulidTrees(1,n);
    }

    public List<TreeNode> BulidTrees(int start,int end){
        List<TreeNode> res = new ArrayList<>();
        if(start > end){
            res.add(null);
            return res;
        }
        if(start == end){
            TreeNode root = new TreeNode(start);
            res.add(root);
            return res;
        }

        //每次选择不同的结点作为根结点
        for(int index=  start; index <= end; index++){

            List<TreeNode> leftTrees = BulidTrees(start,index-1);
            List<TreeNode> rightTrees = BulidTrees(index+1,end);
            for(TreeNode lt:leftTrees){
                for(TreeNode rt:rightTrees){
                    //每次循环都要创建一个root结点，因为每次循环对应不同的树
                    TreeNode root = new TreeNode(index);
                    root.left = lt;
                    root.right = rt;
                    res.add(root);
                }
            }
        }
        return res;
    }

    public void midTraveral(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null){
            if(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }
            else{
                temp = stack.pop();
                System.out.print(temp.val+"\t");
                temp = temp.right;
            }
        }
        System.out.println();
    }
    public void posTraveral(TreeNode root){

        Stack<TreeNode> stack = new Stack<>();
        TreeNode h= root,c=null;
        stack.push(root);
        if(h!=null){
            while(!stack.isEmpty()){
                c = stack.peek();
                if(c.left!=null && c.left!=h && c.right != h)
                    stack.push(c.left);
                else if(c.right!=null && c.right!=h)
                    stack.push(c.right);
                else
                {

                    c = stack.pop();
                    h = c;
                    System.out.print(c.val+"\t");
                }

            }
        }
        System.out.println();

    }
}
