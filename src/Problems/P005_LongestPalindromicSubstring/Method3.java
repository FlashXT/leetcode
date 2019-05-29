package Problems.P005_LongestPalindromicSubstring;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/29 1:17;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//反转原字符串后,查找两个字符串的公共子串,动态规划，时间复杂度O(n^2),空间复杂度O(n)
public class Method3 {

    public String longestPalindrome(String s) {
        String s1 = new StringBuilder(s).reverse().toString();
        int[]memo  = new int[s.length()+1];
        int endindex = 0;
        int maxlen = 0;
        memo[0] = 0;

        for(int i = 1 ; i <= s.length();i++){

            for(int j = s1.length(); j > 0;j--){
                if(s.charAt(i-1) == s1.charAt(j-1)){
                    memo[j] = 1 + memo[j-1];
                    if(memo[j] > maxlen){

                        if(s1.length()-j+memo[j]-1 == i-1 ){
                            maxlen = memo[j];
                            endindex = i;
                        }
                    }
                }
                else
                    memo[j] = 0;
            }
        }
        return s.substring(endindex-maxlen,endindex);
    }

}
