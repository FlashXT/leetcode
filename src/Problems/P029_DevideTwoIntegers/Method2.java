package Problems.P029_DevideTwoIntegers;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/12 15:20;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method2 {
    public int divide(int dividend, int divisor) {
        long  res = 0;
        long  m = Math.abs((long)dividend), n = Math.abs((long)divisor);
        if (m < n) return 0;
        long t = n, p = 1;
        while (m > (t << 1)) {
            t <<= 1;
            p <<= 1;
        }
        res += p + divide((int)(m - t), (int)n);
        if ((dividend < 0) ^ (divisor < 0)) res = -res;
        return res > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)res;
    }
}
