package Problems.P032_LongestValidParentheses;

import java.util.Stack;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/15 16:02;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//栈
public class Method4 {
    public int longestValidParentheses(String s) {
       int maxans = 0;
       Stack<Integer> stack = new Stack<>();
       stack.push(-1);
       for(int i = 0; i< s.length();i++){
           if(s.charAt(i) == '(')
               stack.push(i);
           else{
               stack.pop();
               if(stack.isEmpty()){
                   stack.push(i);
               }
               else{
                   maxans = maxans < i-stack.peek()? i-stack.peek():maxans;
               }
           }
       }
        return maxans;
    }
}
