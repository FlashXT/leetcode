package Problems.P30_SubstringwithConcatenationofAllWords;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/12 21:54;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public List<Integer> findSubstring(String s, String [] words){
        List<Integer> res = new ArrayList<>();
        int wordnum = words.length;
        if(wordnum == 0)
            return res;
        int wordlen =words[0].length();
        //将words中的单词存入HashMap(word:times)
        HashMap<String, Integer> hashmap1 = new HashMap<>();
        for(String word:words){
            int value = hashmap1.getOrDefault(word,0);
            hashmap1.put(word,value+1);
        }
        //遍历所有子串
        for(int i = 0; i < s.length()-wordnum*wordlen+1;i++){
            HashMap<String, Integer> temp = new HashMap<>();
            int num = 0;
            while(num < wordnum){
                String word = s.substring(i+num*wordlen,i+(num+1)*wordlen);
                if(hashmap1.containsKey(word)){
                    int value = temp.getOrDefault(word,0);
                    if (value+1 > hashmap1.get(word))
                        break;
                    else
                        temp.put(word,value+1);

                }
                else break;
                num++;
            }
            if(num == wordnum)
                res.add(i);
        }
       return res;
    }
}
