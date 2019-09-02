package DataStructure;

import java.util.Stack;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/28,9:22
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Tree {
    public TreeNode root;
    public Tree(){  }
    public Tree(int [] nums){
        this.root = BulidTree(nums,0);
    }
    private TreeNode BulidTree(int [] nums,int index){
        if (index >= nums.length || nums[index]== -1)
            return null;
        TreeNode root = new TreeNode(nums[index]);
        root.left = BulidTree(nums,index*2+1);
        root.right = BulidTree(nums,index*2+2);
        return root;
    }
    public void preTraversal(){
        this.preTraversal(root);
    }
    private void preTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp !=null){
            if(temp!=null){
                System.out.print(temp.val+"\t");
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                temp = temp.right;
            }
        }
        System.out.println();
    }
    public void inTraversal(){
        this.midTraveral(root);
    }
    private void midTraveral(TreeNode root){
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
    public void posTraveral(){
        this.posTraveral(root);
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
