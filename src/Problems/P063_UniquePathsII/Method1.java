package Problems.P063_UniquePathsII;

public class Method1 {
    private int res = 0;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        uniquePaths(obstacleGrid,0,0);
        return res;
    }

    private void uniquePaths(int [][] obstacleGrid,int posx,int posy) {
        if(posx == obstacleGrid.length-1 &&  posy == obstacleGrid[0].length-1){
            if(obstacleGrid[posx][posy] == 0)
                res++;
            return ;
        }
        if(posx+1 < obstacleGrid.length && obstacleGrid[posx][posy] == 0)
            uniquePaths(obstacleGrid,posx+1,posy);
        if(posy+1 < obstacleGrid[0].length&&obstacleGrid[posx][posy] == 0)
            uniquePaths(obstacleGrid,posx,posy+1);
    }
}
