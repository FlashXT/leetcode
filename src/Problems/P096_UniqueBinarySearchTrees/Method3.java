package Problems.P096_UniqueBinarySearchTrees;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/26,11:05
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//动态规划
public class Method3 {

    public int numTrees(int n) {
        int [] memo = new int[n+1];
        memo[0] = 1;
        memo[1]=1;
        for(int i= 2 ;i <= n;i++){
            for(int j = 0 ; j< i;j++){
                memo[i]+=  memo[j] * memo[i-j-1];
            }
        }
        return memo[n];
    }
}
