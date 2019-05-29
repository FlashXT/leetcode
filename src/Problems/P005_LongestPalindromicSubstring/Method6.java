package Problems.P005_LongestPalindromicSubstring;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/29 1:17;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//中心扩展法
public class Method6 {

    public String longestPalindrome(String s) {
       if(s.length() == 0) return "";
       String res = s.substring(0,1);
       for(int i = 0; i < s.length();i++){

           String p1 = expandAroundCenter(s,i,i);
           if(p1.length() > res.length())
               res = p1;
           String p2 = expandAroundCenter(s,i,i+1);
           if(p2.length() > res.length())
               res = p2;
       }
        return res;
    }
    public String expandAroundCenter(String s, int l, int r){
        int n = s.length();
        while( l >=0 && r <=n-1 && s.charAt(l)== s.charAt(r)){
            l--;
            r++;
        }

        return s.substring(l+1,r);
    }




}
