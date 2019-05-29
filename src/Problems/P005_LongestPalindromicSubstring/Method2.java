package Problems.P005_LongestPalindromicSubstring;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/29 0:17;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//反转原字符串后,查找两个字符串的公共子串,动态规划，时间复杂度O(n^2),空间复杂度O(n^2)
public class Method2 {

    public String longestPalindrome(String s) {
        String s1 = new StringBuilder(s).reverse().toString();
        //memo[i][j]表示s[0~i-1],s1[0~j-1]时的最长公共子串的长度
        int[][]memo  = new int[s.length()+1][s1.length()+1];
        int endindex = 0;
        int maxlen = 0;
        memo[0][0] = 0;

        for(int i = 1 ; i <= s.length();i++){

            for(int j = 1; j <=s1.length();j++){
                if(s.charAt(i-1) == s1.charAt(j-1)){
                    memo[i][j] = 1 + memo[i-1][j-1];
                    if(memo[i][j] > maxlen){

                        if(s1.length()-j+memo[i][j]-1 == i-1 ){
                            maxlen = memo[i][j];
                            endindex = i;
                        }
                    }
                }
                //使用二维数组，memo[i][j]默认为0,可以注释掉
                else
                    memo[i][j] = 0;
            }
        }
        return s.substring(endindex-maxlen,endindex);
    }

}
