package Problems.P044_WildcardMatching;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/23 8:26;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//递归运行超时
public class Method1 {
    public boolean isMatch(String s, String p) {
        return isMatchR(s,p);
    }
    public boolean isMatchR(String s,String p) {
        if(s.length() == 0 && p.length() == 0)
            return true;

        if( p.length()>0 && p.charAt(0)=='*'){
            //*匹配0个字符
            boolean a = isMatchR(s,p.substring(1));
            if(s.length()>0){
                //*匹配多个字符
                boolean b =isMatchR(s.substring(1),p);
                return a||b;
            }
            else
                return a;
        }else{
            if(s.length()>0 && p.length()>0 && (s.charAt(0)==p.charAt(0)||p.charAt(0)=='?'))
                return isMatchR(s.substring(1),p.substring(1));
            else
                return false;
        }

    }
}
