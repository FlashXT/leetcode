package Problems.P091_DecodeWays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/22,8:59
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//动态规划
public class Method4 {

    public int numDecodings(String s) {

        //memo[i]表示s从[0,i]的解码方式数目；memo[i] = memo[i-1]+memo[i-2]
        int [] memo = new int[s.length()+1];

        memo[0]=1;
        if(s.charAt(0) !='0') memo[1]=1;

        for(int i = 2; i <= s.length();i++){

            if(s.charAt(i-1)!= '0'){
                memo[i] = memo[i-1];
            }
            if(s.charAt(i-2)=='1' || (s.charAt(i-2)=='2' && s.charAt(i-1)<='6'))
                memo[i]+=memo[i-2];
        }
        return memo[s.length()];
    }

}
