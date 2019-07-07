package Problems.P014_LongestCommonPrefix;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/7 8:11;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        String [] strs = {"flower","flow","flight"};
        System.out.println(new Method2().longestCommonPrefix(strs));
        System.out.println(new Method3().longestCommonPrefix(strs));
    }
}
