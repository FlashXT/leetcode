package Problems.P097_InterleavingString;

import java.util.HashMap;

/*****************************************************************
 * @Author:FlashXT;
 * @Date: 2019/8/27 10:37
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//记忆化搜索
public class Method2 {
    public boolean isInterleave(String s1, String s2, String s3) {
        HashMap<String ,Integer> memo = new HashMap<>();
        return isInterleave(s1,0,s2,0,s3,0,memo);
    }
    public boolean isInterleave(String s1,int index1,String s2,int index2,String s3,int index3,HashMap<String,Integer> memo){

        if(s1.length() + s2.length() !=s3.length())
            return false;
        String key = index1+"_"+index2;
        if(memo.containsKey(key))
            return memo.getOrDefault(key,-1) ==1;
        if(index1 == s1.length() && index2 == s2.length() && index3 == s3.length()){
            memo.put(key,1);
            return true;
        }

        if(index1 == s1.length()){
            while(index2 < s2.length()){
                if(s2.charAt(index2)!=s3.charAt(index3)){
                    memo.put(key,0);
                    return false;
                }
                index2++;
                index3++;
            }
            memo.put(key,1);
            return true;
        }
        if(index2 == s2.length()){
            while(index1 < s1.length()){
                if(s1.charAt(index1)!=s3.charAt(index3)){
                    memo.put(key,0);
                    return false;
                }
                index1++;
                index3++;
            }
            memo.put(key,1);
            return true;
        }
        if(s1.charAt(index1) == s3.charAt(index3)){
            if(isInterleave(s1,index1+1,s2,index2,s3,index3+1,memo)){
                memo.put(key,1);
                return true;
            }

        }
        if(s2.charAt(index2) == s3.charAt(index3)){
            if(isInterleave(s1,index1,s2,index2+1,s3,index3+1,memo)){
                memo.put(key,1);
                return true;
            }

        }
        memo.put(key,0);
        return false;

    }
}
