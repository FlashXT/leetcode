package Problems.P044_WildcardMatching;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/23 8:16;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        String a="aa";

        String b="*";
        boolean res = new Method3().isMatch(a,b);
        System.out.println(res);
    }
}
