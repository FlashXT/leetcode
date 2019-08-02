package Problems.P070_ClimbingStairs;

//动态规划空间复杂度优化
public class Method3 {

    public int climbStairs(int n) {
        if(n < 2) return 1;
        int memo0 = 1;
        int memo1 = 1;
        int memo2 = 0;
        for(int i = 2 ;i <=n;i++){
           memo2 = memo0 +memo1;
           memo0 = memo1;
           memo1 = memo2;
        }
        return memo2;
    }

}
