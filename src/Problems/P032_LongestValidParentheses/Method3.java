package Problems.P032_LongestValidParentheses;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/15 16:02;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//动态规划：分析：https://leetcode.wang/leetCode-32-Longest-Valid-Parentheses.html
public class Method3 {
    public int longestValidParentheses(String s) {
        int [] memo = new int[s.length()];
        int ans = 0;
        for(int i = 1; i < s.length();i++){
            if(s.charAt(i) == ')'&& s.charAt(i-1) == '('){
                int pos = i >=2 ? i-2:0;
                memo[i] = memo[pos]+2;
            }
            if(s.charAt(i) == ')'&& s.charAt(i-1) == ')'){
                if(i-memo[i-1]-1 >=0 && s.charAt(i-memo[i-1]-1)=='('){
                    memo[i]=memo[i-1]+2;
                    if(i-memo[i-1]-2 >= 0)
                        memo[i]=memo[i]+memo[i-memo[i-1]-2];
                }
            }
            ans = ans < memo[i]?memo[i]:ans;
        }
        return ans;

    }
}
