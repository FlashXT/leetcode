package Problems.P065_ValidNumber;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/31 16:37;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public boolean isNumber(String s) {
        if (s == null || s.length() == 0){
            return false;
        }
        s = s.trim();
        boolean seenE = false;
        boolean seenDot = false;
        boolean seenNum = false;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c >= '0' && c <= '9'){
                seenNum = true;
            } else if (c == 'e'){
                if (!seenNum || seenE){
                    return false;
                }
                seenE = true;
                seenNum = false;
            } else if (c == '+' || c == '-'){
                if (i > 0 && s.charAt(i - 1) != 'e'){
                    return false;
                }
            } else if (c == '.'){
                if (seenDot || seenE){
                    return false;
                }
                seenDot = true;
            } else {
                return false;
            }
        }
        return seenNum;
    }
}
