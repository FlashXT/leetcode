package Problems.P029_DevideTwoIntegers;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/12 15:20;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public int divide(int dividend, int divisor){
        long ans =  dividelong(dividend,divisor);

        return ans > Integer.MAX_VALUE?Integer.MAX_VALUE:(int)ans;
    }
    public long dividelong(long dividend ,long divisor) {
        long ans = 1;
        long sign = 1;
        sign = dividend < 0 ? -sign:sign;//标记
        dividend = dividend < 0 ? ~dividend+1:dividend;//求变补

        sign = divisor < 0 ? -sign:sign;//标记
        divisor = divisor < 0 ? ~divisor+1:divisor;//求变补

        long origin_divisor = divisor;
        if(dividend < divisor)
            return 0;
        dividend -= divisor;
        //每次循环，divisor增大1倍，同时ans也增大1倍，减少循环次数，防止超时
        while(dividend >= divisor){
            ans += ans;
            dividend -=divisor;
            divisor*=2;
        }
        ans = ans + dividelong(dividend,origin_divisor);

        return sign > 0 ? ans:~ans+1;

    }

}
