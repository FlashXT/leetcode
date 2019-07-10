package Problems.P20_ValidParentheses;

import java.util.Stack;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/10 14:26;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public boolean isValid(String s) {
        if (s== null) return true;
        Stack<Character> stack = new Stack<>();

        char [] ch = s.toCharArray();
        int i = 0;
        while(i < ch.length){
            if(ch[i] =='('||ch[i] =='['||ch[i] =='{')
                stack.push(ch[i]);
            else if(!stack.isEmpty() && (ch[i] ==')'||ch[i] ==']'||ch[i] =='}')){
                char temp = stack.peek();
                if (temp =='(' && ch[i] ==')' ||
                        temp =='[' && ch[i] ==']' ||
                        temp =='{' && ch[i] =='}'){
                    stack.pop();
                }
                else
                    return false;
            }
            else
                return false;
            i++;
        }
        return stack.isEmpty();

    }
}
