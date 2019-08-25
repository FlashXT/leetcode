package Problems.P093_RestoreIPAddresses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/25,10:35
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//暴力法，因为IP只有4段，可以用4层for循环解决
public class Method2 {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        String ans;
        for(int a = 1; a <=3 ;a++){
            for(int b = a+1; b <=6;b++){
                for(int c = b+1; c <=9;c++){
                    for(int d = c+1; d <=12;d++){
                        if( d == s.length()){
                            //String转int是除去了前导0(003 -> 3),后面的长度过滤可以去除这种情况
                            int A = Integer.valueOf(s.substring(0,a));
                            int B = Integer.valueOf(s.substring(a,b));
                            int C = Integer.valueOf(s.substring(b,c));
                            int D = Integer.valueOf(s.substring(c,d));
                            if(A<=255 && B <=255 && C<=255 && D <=255){
                                ans = ""+A+"."+B+"."+C+"."+D;
                                if(ans.length() == s.length()+3)
                                    res.add(ans);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
