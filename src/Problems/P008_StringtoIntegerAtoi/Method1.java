package Problems.P008_StringtoIntegerAtoi;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/31 8:54;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//32位整数的范围[-2^31,2^31-1]
public class Method1 {
    public int myAtoi(String str) {
        str = str.trim();
        if(str.length() == 0) return 0;
        int res= 0;
        int i = 0;
        int sign = 1;
        if(str.charAt(0)=='-' || str.charAt(0)=='+'){
            i = 1;
            if(str.charAt(0) =='-')
                sign = -1;

        }
        for(; i < str.length();i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <='9'){
                //判断是否越界
                if(res > Integer.MAX_VALUE/10){
                    return sign >0 ?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
                //判断加上最后一位后是否越界
                else if(res == Integer.MAX_VALUE / 10  &&
                        Integer.MAX_VALUE % 10 < (str.charAt(i)-'0')){
                    return sign >0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                res = res*10+(str.charAt(i)-'0');
            }
            else
                break;
        }
        return sign*res;
    }
}
