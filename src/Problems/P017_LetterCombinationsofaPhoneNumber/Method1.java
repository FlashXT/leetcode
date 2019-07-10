package Problems.P017_LetterCombinationsofaPhoneNumber;

import java.util.*;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/9 8:29;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public List<String> letterCombinations(String digits) {
        String [] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        Queue<String> queue = new LinkedList<>();
        for(int i = 0; i < digits.length();i++){
            String temp = map[Integer.valueOf(digits.charAt(i))-'0'];
            int len = queue.size();
            if(len == 0){
                for(int k = 0; k < temp.length();k++){
                    queue.add(""+temp.charAt(k));
                }
            }
            for(int j = 0; j < len;j++){
                String ctemp = queue.poll();
                for(int k = 0; k < temp.length();k++){
                   queue.add(ctemp+temp.charAt(k));
                }
            }
        }
        List<String> res = new ArrayList<>();
        while(!queue.isEmpty())
            res.add(queue.poll());
        return res;
    }
}
