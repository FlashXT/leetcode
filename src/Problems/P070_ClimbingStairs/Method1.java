package Problems.P070_ClimbingStairs;

//递归运行超时
public class Method1 {

    public int climbStairs(int n) {
        int res = 0;
        return climbStairs(n,0,res);
    }
    public int climbStairs(int n,int steps,int res) {
        if(steps >= n){
            if(steps == n)
                res++;
            return res;
        }
        res = climbStairs(n,steps+1,res);
        res = climbStairs(n,steps+2,res);
        return res;
    }
}
