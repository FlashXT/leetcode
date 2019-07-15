package Problems.P032_LongestValidParentheses;

import java.util.Stack;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/15 14:06;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//
public class Method2 {
    public int longestValidParentheses(String s) {
        int maxlen = 0;
        for(int i = 0; i < s.length();i++){
            int count = 0;
            for(int j = i; j < s.length();j++){
                if(s.charAt(j)=='('){
                    count++;
                }
                else{
                    count--;
                }
                if(count < 0) break;
                if(count == 0){
                    maxlen = maxlen < j-i+1?j-i+1:maxlen;
                }
            }
        }
        return maxlen;
    }
}
