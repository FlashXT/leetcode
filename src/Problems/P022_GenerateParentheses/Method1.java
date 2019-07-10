package Problems.P022_GenerateParentheses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/10 14:57;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//暴力方法(递归+回溯)
public class Method1 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateall(res,"",2*n);
        System.out.println(res);
        return res;
    }
    public void generateall(List<String> res,String str,int length ){
        if (str.length() == length){
            if (valid(str)){
                res.add(str);
            }
            return ;
        }
        else{
            generateall(res,str+"(",length);
            generateall(res,str+")",length);
        }

    }
    public boolean valid(String str) {
        char [] current = str.toCharArray();
        int balance = 0;
        for (char c: current) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return (balance == 0);
    }
}
