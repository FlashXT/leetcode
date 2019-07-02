package Problems.P010_RegularExpressionMatching;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/6/26 8:05;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        String str = "ab";
        String pattern = "a*";
        System.out.println(new Mehtod1().isMatch(str,pattern));
        System.out.println(new Mehtod2().isMatch(str,pattern));
        System.out.println(new Mehtod3().isMatch(str,pattern));
    }
}
