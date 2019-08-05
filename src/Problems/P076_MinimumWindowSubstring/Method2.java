package Problems.P076_MinimumWindowSubstring;

import java.util.HashMap;
import java.util.Map;
//https://blog.csdn.net/u013115610/article/details/70257445

public class Method2 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        //统计字符出现的次数
        for(int i = 0; i < t.length();i++){
            char temp  = t.charAt(i);
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        int minStart = 0;
        int minEnd = -1;
        int start = 0;
        int minlen = Integer.MAX_VALUE;
        for(int end = 0; end < s.length();end++){
            char temp  = s.charAt(end);
            if(map.containsKey(temp)){
                map.replace(temp,map.get(temp)-1);
                while(isAllZeros(map)){
                    if(minlen > end - start){
                        minStart = start;
                        minEnd = end;
                        minlen = minEnd -minStart;
                    }
                    temp = s.charAt(start);
                    if(map.containsKey(temp)){
                        map.put(temp,map.get(temp)+1);
                    }
                    start++;
                }
            }

        }
        return s.substring(minStart,minEnd+1);
    }
    public static boolean isAllZeros(Map<Character,Integer> map){
        for(char ch : map.keySet()){
            if(map.get(ch) > 0)
                return false;
        }
        return true;
    }
}
