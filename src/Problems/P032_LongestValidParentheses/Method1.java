package Problems.P032_LongestValidParentheses;

import java.util.Stack;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/15 14:06;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//暴力方法：超时
public class Method1 {
    public int longestValidParentheses(String s) {
        int maxlen = 0;
        for(int i = 0;i < s.length();i++){
            for(int j = i+2; j <= s.length();j+=2){
                if(isValid(s.substring(i,j))){
                    maxlen = Math.max(maxlen,j-i);
                }
            }
        }
        return maxlen;
    }
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length();i++){
            if(stack.isEmpty())
                stack.push(s.charAt(i));
            else{
                if(s.charAt(i)=='('){
                    stack.push(s.charAt(i));
                }
                else{
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
