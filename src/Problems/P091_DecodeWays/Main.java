package Problems.P091_DecodeWays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/22,8:59
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static  void main(String [] args){
        String str = "226";
        int res = new Method4().numDecodings(str);
        System.out.println(res);
    }
}
