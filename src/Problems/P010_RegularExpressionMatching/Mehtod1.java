package Problems.P010_RegularExpressionMatching;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/6/26 8:05;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//递归方法
public class Mehtod1 {

    public boolean isMatch(String str, String pattern) {
           if(pattern.isEmpty()) return str.isEmpty();
           boolean first_match = (!str.isEmpty() &&
                   (pattern.charAt(0)==str.charAt(0)|| pattern.charAt(0) == '.'));
           if (pattern.length()>=2 && pattern.charAt(1)=='*'){
               return isMatch(str,pattern.substring(2)) ||
                       (first_match && isMatch(str.substring(1),pattern));
           }
           else{
               return first_match && isMatch(str.substring(1),pattern.substring(1));
           }

    }
}
