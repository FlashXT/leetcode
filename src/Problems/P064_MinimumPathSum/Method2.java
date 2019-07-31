package Problems.P064_MinimumPathSum;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/31 16:08;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//动态规划
public class Method2 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][] memo = new int[m][n];
        //数组的初始化设置
        memo[0][0] = grid[0][0];
        for(int i = 1; i<m;i++)
            memo[i][0] = memo[i-1][0]+grid[i][0];
        for(int i = 1; i<n;i++)
            memo[0][i] = memo[0][i-1]+grid[0][i];
        for(int i = 1; i < m;i++){
            for(int j = 1; j<n;j++){
                //状态转移方程
                memo[i][j]=Math.min(memo[i-1][j],memo[i][j-1])+grid[i][j];
            }
        }
        return memo[m-1][n-1];
    }

}
