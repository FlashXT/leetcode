package Problems.P022_GenerateParentheses;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/10 14:57;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
/*
* Given n pairs of parentheses, write a function to generate all combinations
* of well-formed parentheses.
* For example, given n = 3, a solution set is:
    [
      "((()))",
      "(()())",
      "(())()",
      "()(())",
      "()()()"
    ]
*/
public class Main {
    public static  void main(String [] args){
        new Method2().generateParenthesis(3);
    }
}
