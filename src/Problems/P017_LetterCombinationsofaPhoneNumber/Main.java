package Problems.P017_LetterCombinationsofaPhoneNumber;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/9 8:27;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
/*
Given a string containing digits from 2-9 inclusive, return all possible letter
combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.
Note that 1 does not map to any letters.

Example:

    Input: "23"
    Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
public class Main {
    public static void main(String [] args){
//        System.out.println(new Method3().letterCombinations("27"));
        System.out.println(new Method2().letterCombinations("27"));

    }
}
