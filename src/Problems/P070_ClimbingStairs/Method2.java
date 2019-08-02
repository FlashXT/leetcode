package Problems.P070_ClimbingStairs;

//动态规划
public class Method2 {

    public int climbStairs(int n) {
        if(n < 2) return 1;
        int [] memo = new int [n];
        memo[0] = 1;
        memo[1] = 2;
        for(int i = 2 ;i <n;i++){
           memo[i] = memo[i-1]+memo[i-2];
        }
        return memo[n-1];
    }

}
