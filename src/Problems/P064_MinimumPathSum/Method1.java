package Problems.P064_MinimumPathSum;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/31 16:08;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//递归运行超时
public class Method1 {
    private int res = Integer.MAX_VALUE;
    public int minPathSum(int[][] grid) {


        minPathSum(grid,0,0,0);
        return res;
    }
    public void minPathSum(int[][] grid,int posx,int posy,int sum) {
        if(posx == grid.length-1 && posy == grid[0].length-1){
            sum+=grid[posx][posy];
            res = res  > sum ? sum:res;
            return ;
        }
        if(posx == grid.length || posy == grid[0].length){
            return ;
        }
        sum+=grid[posx][posy];
        minPathSum(grid,posx+1,posy,sum);
        minPathSum(grid,posx,posy+1,sum);

    }
}
