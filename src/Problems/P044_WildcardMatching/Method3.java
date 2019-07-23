package Problems.P044_WildcardMatching;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/23 10:04;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//动态规划
public class Method3 {

    public boolean isMatch(String s, String p) {
        boolean [][] memo = new boolean[s.length()+1][p.length()+1];
        memo[0][0]=true;
        for(int i =0 ;i < p.length();i++){
            if(p.charAt(i)=='*')
                memo[0][i+1]=memo[0][i];
        }
        for(int i = 0; i < s.length();i++) {
            for (int j = 0; j < p.length(); j++) {

                if (p.charAt(j) == '*') {
                    //memo[i][j]表示*和当前字符匹配(*前字符出现1次)
                    //memo[i][j+1]表示*前字符出现0次
                    //memo[i+1][j]表示*前字符出现多次
                    memo[i+1][j+1] = memo[i][j]||memo[i][j+1] || memo[i+1][j];
                } else {
                    boolean first_match = s.charAt(i) == p.charAt(j) || p.charAt(j) == '?' ;
                    memo[i+1][j+1] = memo[i][j] && first_match  ;
                }
            }
        }
        for(int i =0 ;i < memo.length;i++){
            for(int j =0 ; j < memo[i].length;j++){
                System.out.print(memo[i][j]+"\t");
            }
            System.out.println();
        }
        return memo[s.length()][p.length()];
    }

}
