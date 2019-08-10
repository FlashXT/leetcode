package Problems.P0100_SameTree;

import DataStructure.TreeNode;

/*****************************************************************
 * @Author:FlashXT;
 * @Date: 2019/8/10 9:19
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)  return true;
        if(p == null || q == null || p.val!=q.val) return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);

    }
}
