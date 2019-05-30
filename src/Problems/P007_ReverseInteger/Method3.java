package Problems.P007_ReverseInteger;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/30 9:10;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method3 {
    public int reverse(int x) {
        long res = 0;
        int temp = Math.abs(x);
        while(temp != 0){

            res = res*10+temp%10;
            temp = temp/10;
        }
        res = x>0 ? res:-res;
        if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            return 0;
        return (int)res;
    }
}
