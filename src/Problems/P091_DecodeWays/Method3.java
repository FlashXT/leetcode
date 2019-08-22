package Problems.P091_DecodeWays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/22,8:59
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//记忆化搜索
public class Method3 {

    private int [] memo;
    public int numDecodings(String s) {
        memo = new int[s.length()];
        for(int i = 0; i< memo.length;i++)
            memo[i] = -1;
        return numDecodings(s,0);
    }
    public int numDecodings(String s,int index) {
        if(index == s.length())
           return 1;
        if(s.charAt(index) =='0')
            return 0;
        if(memo[index]!=-1)
           return memo[index];
        int ans1 = numDecodings(s,index+1);
        int ans2 = 0;
        if(index+2 <=s.length()){

            String temp = s.substring(index,index+2);
            if(temp.compareTo("1") >=0 && temp.compareTo("26") <=0)
                ans2 = numDecodings(s,index+2);
        }
        memo[index]=ans1+ans2;
        return ans1+ans2;
    }
}
