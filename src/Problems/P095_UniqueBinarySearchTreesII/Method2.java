package Problems.P095_UniqueBinarySearchTreesII;

import DataStructure.TreeNode;

import javax.transaction.TransactionRequiredException;
import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/26,19:54
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//规律:首先我们每次新增加的数字大于之前的所有数字，所以新增加的数字出现的位置只可能
//是根节点或者是根节点的右孩子，右孩子的右孩子，右孩子的右孩子的右孩子等等，总之一
//定是右边。其次，新数字所在位置原来的子树，改为当前插入数字的左孩子即可，因为插入
//数字是最大的。
//由于求当前的所有解只需要上一次的解，所有我们只需要两个 list，pre 保存上一次的所有解，
//cur 计算当前的所有解。
public class Method2 {
    public List<TreeNode> generateTrees(int n){
        List<TreeNode> pre = new ArrayList<>();
        if(n == 0)
            return pre;
        pre.add(null);
        //每次增加一个数字
        for(int i = 1; i <= n ;i++){
            List<TreeNode> cur = new ArrayList<>();
            //遍历之前的所有解
            for(TreeNode root:pre){
                //插入到根节点
                TreeNode temp = new TreeNode(i);
                temp.left = root;
                cur.add(temp);
                //插入到右孩子,右孩子的右孩子...
                for(int j = 0; j <= n;j++){
                    TreeNode root_copy = treeCopy(root);//复制当前的树
                    TreeNode right = root_copy; //找到要插入右孩子的位置
                    int k = 0;
                    //遍历j次找右孩子
                    for(;k<j;k++){
                        if(right == null)
                            break;
                        right = right.right;
                    }
                    //到达null提前结束
                    if(right == null)
                        break;
                    //保存当前右孩子的位置的子树作为插入结点的左孩子
                    TreeNode rightTree = right.right;
                    temp = new TreeNode(i);
                    right.right = temp; //右孩子是插入的结点
                    temp.left = rightTree; //插入结点的左孩子更新位插入位置之前的子树
                    //加入结果集中
                    cur.add(root_copy);
                }

            }
            pre = cur;

        }
        return pre;
    }

    private TreeNode treeCopy(TreeNode root){
        if(root == null)
            return root;
        TreeNode newRoot = new TreeNode(root.val);
        newRoot.left = treeCopy(root.left);
        newRoot.right = treeCopy(root.right);
        return newRoot;
    }
}
