package Problems.P087_ScrambleString;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/21,10:22
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//动态规划：
public class Method3 {
    public boolean isScramble(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        if(s1.equals(s2)) return true;
        //判断两个字符串每个字母出现的次数是否一致
        int [] letters = new int[26];
        for(int i = 0; i < s1.length();i++){
            letters[s1.charAt(i)-'a']++;
            letters[s2.charAt(i)-'a']--;
        }
        for(int i = 0; i < letters.length;i++){
            if(letters[i]!=0)
                return false;
        }
        int length = s1.length();
        //dp [ len ][ i ] [ j ] 来表示 s1[ i, i + len ) 和 s2 [ j, j + len )
        // 两个字符串是否满足条件。换句话说，就是 s1 从 i 开始的 len 个字符是否能转换
        // 为 S2 从 j 开始的 len 个字符。
        boolean[][][]dp = new boolean[length+1][length][length];
        for(int len = 1; len <=length;len++){
            for(int i = 0; i + len <= length;i++){
                for(int j = 0; j+ len <=length;j++){
                    if(len == 1){
                        dp[len][i][j]= s1.charAt(i)==s2.charAt(j);
                    }
                    else{
                        for(int q = 1; q <len;q++){
                            dp[len][i][j] = dp[q][i][j] && dp[len-q][i+q][j+q]||
                                    dp[q][i][j+len-q]&&dp[len-q][i+q][j];
                            if(dp[len][i][j])
                                break;
                        }
                    }
                }
            }
        }
        return dp[length][0][0];
    }

}
