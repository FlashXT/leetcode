package Problems.P007_ReverseInteger;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/30 9:10;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public int reverse(int x) {
        //32位int[-2^31,2^31-1],输入最小值，一定会溢出，直接返回
        if(x == Integer.MIN_VALUE) return 0;
        int res = 0;
        int temp = Math.abs(x);
        while(temp != 0){
            //在反转过程中溢出，直接返回0
            if(res>(Integer.MAX_VALUE-temp%10)/10)
                return 0;
            res = res*10+temp%10;
            temp = temp/10;
        }
        res = x>0 ? res:-res;
        return res;
    }
}
