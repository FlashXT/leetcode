package Problems.P087_ScrambleString;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/17,8:47
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        String str1 = "great";
        String str2 = "rgeat";
        boolean b = new Method1().isScramble(str1,str2);
        System.out.println(b);
    }
}
