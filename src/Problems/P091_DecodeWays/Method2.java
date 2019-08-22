package Problems.P091_DecodeWays;

import org.omg.PortableInterceptor.INACTIVE;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/22,9:50
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method2 {

    public int numDecodings(String s){
        return numDecodings(s,0);
    }
    public int numDecodings(String s,int index){
        if(index == s.length()){
            return 1;
        }
        if(s.charAt(index) =='0') return 0;
        int ans1 = numDecodings(s,index+1);
        int ans2 = 0;
        if(index+2 <=s.length()){

            //substring方法超时
//            String temp = s.substring(index,index+2);
//            if(temp.compareTo("1") >=0 && temp.compareTo("26") <=0)
            //改用计算整数值
            int ten = (s.charAt(index)-'0')*10;
            int one =(s.charAt(index+1)-'0');
            if(ten+one <=26)
                ans2 = numDecodings(s,index+2);
        }

        return ans1+ans2;
    }

}
