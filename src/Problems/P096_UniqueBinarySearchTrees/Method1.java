package Problems.P096_UniqueBinarySearchTrees;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/26,11:05
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//递归
public class Method1 {
    public int numTrees(int n) {
        if(n==1 || n== 0) return 1;
        if(n== 2) return 2;
        int sum = 0;
        for(int i= 0 ;i < n;i++)
            sum+=numTrees(i)*numTrees(n-i-1);
        return sum;
    }
}
