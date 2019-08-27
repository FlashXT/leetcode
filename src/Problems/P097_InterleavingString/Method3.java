package Problems.P097_InterleavingString;

/*****************************************************************
 * @Author:FlashXT;
 * @Date: 2019/8/27 11:07
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//动态规划
public class Method3 {

    public boolean isInterleave(String s1, String s2, String s3){
        if(s1.length()+s2.length() !=s3.length())
            return false;
        //memo[i][j]表示s1[0,i)和s2[0,j)是否能构成s3[0,i+j)
        boolean [][]memo = new boolean[s1.length()+1][s2.length()+1];
        for(int i = 0; i <=s1.length();i++){
            for(int j = 0; j <= s2.length();j++){
                if(i == 0 && j == 0)
                    memo[i][j] = true;
                else if( i == 0)
                    memo[i][j] = memo[i][j-1]&&s2.charAt(j-1) == s3.charAt(i+j-1);
                else if(j == 0)
                    memo[i][j] = memo[i-1][j]&&s1.charAt(i-1) == s3.charAt(i+j-1);
                else{
                    memo[i][j] = memo[i-1][j]&&s1.charAt(i-1) == s3.charAt(i+j-1)||
                            memo[i][j-1]&&s2.charAt(j-1) == s3.charAt(i+j-1);
                }
            }
        }
        return memo[s1.length()][s2.length()];
    }
}
