package Problems.P093_RestoreIPAddresses;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/25,9:58
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    private  List<String> ans = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {

        restoreIpAddresses(s,4,"");
        return ans;
    }
    private void restoreIpAddresses(String s,int len,String res) {
        if(len == 0){
            if(s.length() ==0){
                res = res.substring(0,res.length()-1);
                ans.add(res);
            }
            return ;
        }
        int last = Math.min(3,s.length());
        if(last > 0 && s.charAt(0) == '0')
            last = 1;
        for(int i = 1;i <= last;i++){
                if(i < last || (i == last && Integer.valueOf(s.substring(0,last))<=255)){
                    res+=s.substring(0,i)+".";
                    restoreIpAddresses(s.substring(i),len-1,res);
                    res=res.substring(0,res.length()-i-1);
                }
        }

    }
}
