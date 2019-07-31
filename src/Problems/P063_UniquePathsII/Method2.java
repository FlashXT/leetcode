package Problems.P063_UniquePathsII;

public class Method2 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int [][] memo = new int[obstacleGrid.length][obstacleGrid[0].length];
        //初始化与62题有区别,第一行与第一列不能同意初始化为1
        if(obstacleGrid[0][0]==0)memo[0][0]=1;
        for(int i =1; i < memo.length;i++){
            if(obstacleGrid[i][0]==0)
                memo[i][0]=memo[i-1][0];
            else
                memo[i][0]=0;
        }
        for(int i =1; i < memo[0].length;i++){
            if(obstacleGrid[0][i]==0)
                memo[0][i]=memo[0][i-1];
            else
                memo[0][i]=0;
        }
        for(int i =1; i< memo.length;i++){
            for(int j = 1; j < memo[i].length;j++){
                if(obstacleGrid[i][j]==0)
                    memo[i][j]=memo[i-1][j]+memo[i][j-1];
                else
                    memo[i][j] = 0;
            }
        }
        return memo[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }


}
