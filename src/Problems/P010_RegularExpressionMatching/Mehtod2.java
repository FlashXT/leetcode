package Problems.P010_RegularExpressionMatching;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/6/26 8:05;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//动态规划：自顶向下记忆化搜索
public class Mehtod2 {
    enum Result {  TRUE, FALSE    };
    Result[][] memo;
    public boolean isMatch(String str, String pattern) {
        memo = new Result[str.length()+1][pattern.length()+1];
        return matchdp(str,pattern,0,0);

    }
    public boolean matchdp(String str, String pattern,int i ,int j){
        if (memo[i][j]!= null) return memo[i][j] == Result.TRUE ;
        boolean ans;
        if(j == pattern.length()) ans = i== str.length();
        else{
            boolean first_match = (i < str.length() &&
                                   (str.charAt(i)==pattern.charAt(j)||pattern.charAt(j)=='.'));
            if (j+1 < pattern.length() && pattern.charAt(j+1)=='*'){
                ans = (matchdp(str,pattern,i,j+2)||
                        first_match&&(matchdp(str,pattern,i+1,j)));
            }else{
                ans = matchdp(str,pattern,i+1,j+1);
            }
        }
        memo[i][j] = ans?Result.TRUE:Result.FALSE;
        return ans;

    }
}
