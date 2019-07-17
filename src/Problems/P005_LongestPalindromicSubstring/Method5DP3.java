package Problems.P005_LongestPalindromicSubstring;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/29 1:17;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//动态规划
public class Method5DP3 {

    public String longestPalindrome(String s) {
        int length = s.length();
        //memo[i][j] 表示 s[i ~j+1]是否为回文串
        boolean[] memo = new boolean[length];
        String res = "";
        for (int i = length-1; i >0 ; i--)
            for (int j = length-1;j>= i; j--) {

                memo[j] = s.charAt(i) == s.charAt(j)&&(j-i <3|| memo[j-1]);
                if(memo[j] && j-i+1 > res.length() )
                    res = s.substring(i,j+1);
            }
        return res;
    }




}
