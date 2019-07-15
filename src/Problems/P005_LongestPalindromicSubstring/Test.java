package Problems.P005_LongestPalindromicSubstring;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/15 8:18;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Test {
    public static void main(String [] args){
        String s = "aba4acca";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        String s1 = new StringBuffer(s).reverse().toString();
        int [][] memo = new int[s.length()+1][s1.length()+1];
        int maxlen = 0, endindex = 0;
        for(int i = 1; i<= s.length();i++){
            for(int j = 1; j <= s1.length();j++){
                if(s.charAt(i-1) == s1.charAt(j-1)) {
                    memo[i][j] = 1 + memo[i - 1][j - 1];
                    if (memo[i][j] > maxlen) {
                        if(s1.length()-j-1+memo[i][j] == i-1){
                            maxlen = memo[i][j];
                            endindex = i;
                        }

                    }
                }
            }
        }
        return s.substring(endindex-maxlen,endindex);
    }

}
