package Problems.P005_LongestPalindromicSubstring;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/16 21:59;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method4DP2 {
    public String longestPalindrome(String s) {
        if(s.length() == 0) return s;
        int max = 0;
        String res="";
        //memo[i][j] 表示 s[i ~j+1]是否为回文串
        boolean [] [] memo = new boolean[s.length()][s.length()];

        //长度为l的子串是否为回文子串
        for(int l = 1; l <=s.length();l++){
            for(int i = 0; i+l-1 < s.length();i++){
                int j = i+l-1;
                if(i==j)
                    memo[i][j] = true;
                else if(i+1 == j  && s.charAt(i) == s.charAt(j))
                    memo[i][j] = true;
                else if(i+1 == j  && s.charAt(i) != s.charAt(j))
                    memo[i][j] = false;
                else{
                    if(memo[i+1][j-1] == true && s.charAt(i) == s.charAt(j))
                        memo[i][j] = true;
                    else
                        memo[i][j] = false;
                }

                if(memo[i][j]== true && j-i+1 >= max){
                    max = j-i+1;
                    res = s.substring(i,i+max);
                }
            }

        }
    return res;
    }
}
