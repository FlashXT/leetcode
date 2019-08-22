package Problems.P091_DecodeWays;

import java.util.ArrayList;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/22,8:59
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//递归超时
public class Method1 {
    private  int res = 0;
    public int numDecodings(String s) {
        return numDecodings(s,0);
    }
    public int numDecodings(String s,int index) {
      if(index == s.length()){
          res++;
          return res;
      }
      if(s.charAt(index)=='0') return res;
      for(int i = index+1; i <= Math.min(index+2,s.length());i++){
          int temp = Integer.valueOf(s.substring(index,i));

          if(temp>= 1 && temp <= 26){
              numDecodings(s,i);
          }
      }
      return res;
    }
}
