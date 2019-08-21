package Problems.P089_GrayCode;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/21,10:49
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//尝试，格雷码的顺序不对
public class Try01 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        GengrayCode(n,0,"",res);
        for(int i = 0;i < res.size();i++){
            System.out.println(res.get(i));
        }
       return res;
    }
    private void GengrayCode(int n,int index,String temp,List<Integer> res) {
        if(index == n){
            System.out.println(temp);
//            res.add(temp);
            return ;
        }

        for(int i = 0; i <=1;i++){
            temp+=i;
//            temp+=i*Math.pow(2,n-index-1);
            GengrayCode(n,index+1,temp,res);
//            temp-=i*Math.pow(2,n-index-1);
            temp = temp.substring(0,temp.length()-1);
        }
        return ;
    }
}
