package Problems.P010_RegularExpressionMatching;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/6/26 8:05;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//动态规划：自底向上
public class Mehtod3 {

    public boolean isMatch(String str, String pattern) {
        boolean [][]memo = new boolean[str.length() + 1][pattern.length() + 1];
        memo[str.length()][pattern.length()]=true;
        for(int i = str.length(); i >=0 ;i--){
            for(int j = pattern.length()-1 ; j >= 0;j--){
                boolean first_match = ( i < str.length()&&
                        (str.charAt(i)==pattern.charAt(j)|| pattern.charAt(j)=='.'));
                if(j+1 < pattern.length() && pattern.charAt(j)=='*')
                    memo[i][j]=memo[i][j+2]||first_match&&memo[i+1][j];
                else
                    memo[i][j] = first_match && memo[i+1][j+1];

            }
        }
        return memo[0][0];

    }
}
