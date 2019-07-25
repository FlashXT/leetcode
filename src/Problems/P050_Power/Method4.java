package Problems.P050_Power;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/25 15:26;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//通过位运算来计算幂：https://leetcode.wang/leetCode-50-Pow.html
public class Method4 {
    public double myPow(double x, int n) {
        if(x == 1)
            return x;
        if(x == -1){
            if(n%2 == 0)
                return 1;
            else
                return -1;
        }
        if(n == -2147483648)
            return 0;
        if(n == 0)
            return 1;
        if(n > 0)
            return myPowBit(x,n);
        else{

            return 1/myPowBit(x,-n);
        }


    }
    public double myPowBit(double x, int n) {
        double res = 1;
        while(n > 0){
            if((n & 1)== 1)
                res = res * x;
            x = x*x;
            n = n>>1;
        }
        return res;
    }
}
