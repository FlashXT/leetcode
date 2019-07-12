package Problems.P30_SubstringwithConcatenationofAllWords;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/12 21:53;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        String s ="barfoothefoobarman";
        String [] words ={"foo","bar"};
        System.out.println(new Method1().findSubstring(s,words));
    }
}
