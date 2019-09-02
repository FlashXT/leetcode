package Problems.P005_LongestPalindromicSubstring;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/16 21:59;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//算法思想：遍历给定字符串s的长度为l的子串（l=1...s.length），确定子串是否为回文串,
// 整体思路与暴力算法一致，但是在判定子字符串是否为回文串时，采用动态规划方法将时间复杂
// 度降为O(n^2)；
public class Method3DP1 {
    public String longestPalindrome(String s) {
        if(s.length() == 0) return s;
        int max = 0;
        String res="";
        boolean [] [] memo = new boolean[s.length()][s.length()];
        //长度为1的子串为回文串
        for(int i = 0; i < s.length();i++)
            memo[i][i] = true;
        res = s.substring(0,1);
        //长度为2的子串是否为回文串
        for(int i = 0; i < s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1))
                memo[i][i+1] = true;
            if(memo[i][i+1]== true){

                res = s.substring(i,i+2);
            }
        }
        //长度大于2的是否为回文子串
        for(int l = 3; l <=s.length();l++){
            for(int i = 0; i+l-1 < s.length();i++){
                int j = i+l-1;

                if(memo[i+1][j-1] == true && s.charAt(i) == s.charAt(j))
                    memo[i][j] = true;
                else
                    memo[i][j] = false;

                if(memo[i][j]== true && j-i+1 >= max){
                    max = j-i+1;
                    res = s.substring(i,i+max);
                }
            }

        }
    return res;
    }

}
