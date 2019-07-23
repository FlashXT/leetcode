package Problems.P044_WildcardMatching;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/23 10:04;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//记忆化搜索
public class Method2 {
    enum Result{TRUE,FALSE};
    Result memo[][];
    public boolean isMatch(String s, String p) {
        memo = new Result[s.length()+1][p.length()+1];
        return isMatchDP(s,p,0,0);
    }
    public boolean isMatchDP(String s,String p,int i ,int j) {
        if(memo[i][j]!=null) return memo[i][j]==Result.TRUE;
        if(i== s.length() && j==p.length())
            return true;

        if( j < p.length()&& p.charAt(j)=='*'){
            //*匹配0个字符
            if(isMatchDP(s,p,i,j+1))
                memo[i][j+1] = Result.TRUE;
            else
                memo[i][j+1] = Result.FALSE;
            if(i < s.length()){
                //*匹配多个字符
                if(isMatchDP(s,p,i+1,j))
                    memo[i+1][j]=Result.TRUE;
                else
                    memo[i+1][j]=Result.FALSE;
                return memo[i][j+1]==Result.TRUE||memo[i+1][j]==Result.TRUE;
            }
            else
                return memo[i][j+1]==Result.TRUE;
        }else{
            if(i < s.length() && j < p.length()&& (s.charAt(i)==p.charAt(j)||p.charAt(j)=='?')){
                memo[i][j]=Result.TRUE;
                if (isMatchDP(s,p,i+1,j+1))
                    memo[i+1][j+1] = Result.TRUE;
                else
                    memo[i+1][j+1] = Result.FALSE;
                return  memo[i+1][j+1] == Result.TRUE;
            }
            else{
                memo[i][j]=Result.FALSE;
            }
            return  memo[i][j]==Result.TRUE;
        }

    }

}
