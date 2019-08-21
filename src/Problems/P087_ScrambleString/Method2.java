package Problems.P087_ScrambleString;

import java.util.HashMap;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/21,10:05
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//记忆化搜索
public class Method2 {
    public boolean isScramble(String s1,String s2){
        HashMap<String,Integer> memo = new HashMap<>();
        return isScrambleR(s1,s2,memo);
    }
    public boolean isScrambleR(String s1,String s2,HashMap<String,Integer> memo){
        //判断之前是否已经有了结果
        int ret = memo.getOrDefault(s1+"#"+s2,-1);
        if(ret == 1){
            return true;
        }else if(ret == 0){
            return false;
        }
        if(s1.length() != s2.length()){
            memo.put(s1+"#"+s2,0);
            return false;
        }
        if(s1.equals(s2)){
            memo.put(s1+"#"+s2,1);
            return true;
        }
        //判断两个字符串每个字母出现的次数是否一致
        int [] letters = new int[26];
        for(int i = 0; i < s1.length();i++){
            letters[s1.charAt(i)-'a']++;
            letters[s2.charAt(i)-'a']--;
        }
        for(int i = 0; i < letters.length;i++){
            if(letters[i]!=0)
                return false;
        }
        //遍历每个切割位置
        for(int i = 1; i < s1.length();i++){
            //情况1，切割交换
            if(isScramble(s1.substring(0,i),s2.substring(0,i))&&
                    isScramble(s1.substring(i),s2.substring(i))){
                memo.put(s1+"#"+s2,1);
                return true;
            }

            //情况2，交换切割
            if(isScramble(s1.substring(i),s2.substring(0,s2.length()-i))&&
                    isScramble(s1.substring(0,i),s2.substring(s2.length()-i))){
                memo.put(s1+"#"+s2,1);
                return true;
            }

        }
        memo.put(s1+"#"+s2,0);
        return false;
    }
}
