package Problems.P096_UniqueBinarySearchTrees;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/26,11:05
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//记忆化搜索
public class Method2 {
    private int [] memo;
    public int numTrees(int n){
        memo = new int[n+1];
        memo[0] = 1;
        memo[1] = 1;
        int num = numtrees(n);
        return num;

    }
    public int numtrees(int n) {
        if(n==1 || n== 0) return 1;

        for(int i= 0 ;i < n;i++){
            if(memo[i] == 0)
                memo[i] = numtrees(i);
            if(memo[n-i-1] == 0)
                memo[n-i-1] = numtrees(n-i-1);
            memo[n] += memo[i] * memo[n-i-1];
        }
        return memo[n];
    }
}
