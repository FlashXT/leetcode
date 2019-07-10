package Problems.P017_LetterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/9 9:34;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//递归方法
public class Method2 {
    private static final String [] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        GetCombination(digits,0,"",res);
        return res;

    }
    private void GetCombination(String digits,int index,String prefix,List<String> res){
        if(index >= digits.length()){
            res.add(prefix);
            return ;
        }
        String temp = map[Integer.valueOf(digits.charAt(index)-'0')];
        for(int i = 0; i < temp.length();i++)
        {
            GetCombination(digits,index+1,prefix+temp.charAt(i),res);
        }

    }
}
