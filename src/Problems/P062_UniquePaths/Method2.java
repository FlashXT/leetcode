package Problems.P062_UniquePaths;

//动态规划,自底向上
public class Method2 {
    public int uniquePaths(int m, int n) {
        int [][] memo = new int[m][n];
        //注意初始化问题
        //由于只能往下和往右走，因此第1行和第1列都只有一种走法
        for(int i = 0 ; i< m;i++){
            memo[i][0] = 1;
        }
        for(int i = 0 ; i< n;i++){
            memo[0][i] = 1;
        }

        for(int i = 1; i<m;i++){
            for(int j = 1; j < n;j++){
                //状态转移方程: memo[i][j] = memo[i-1][j]+memo[i][j-1]
                memo[i][j] = memo[i-1][j]+memo[i][j-1];
            }
        }
        return memo[m-1][n-1];
    }

}
