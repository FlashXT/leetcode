package Problems.P076_MinimumWindowSubstring;

import java.util.*;
//https://blog.csdn.net/u013115610/article/details/70257445

public class Method1 {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int minStart = 0, minEnd = -1;
        //统计每个字符出现的次数
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        int count = t.length();
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            //扩展右边界
            char ch = s.charAt(end);
            if (map.containsKey(ch)) {
                map.replace(ch, map.get(ch) - 1);
                if (map.get(ch) >= 0) {
                    count--;
                }
            }

            while (count == 0) {
                //更新长度
                if (end - start < min) {
                    min = end - start;
                    minStart = start;
                    minEnd = end;
                }
                char temp = s.charAt(start);
                //收缩左边界
                if (map.containsKey(temp)) {
                    map.replace(temp, map.get(temp) + 1);
                    if(map.get(temp) >0)count++;
                }
                start++;
            }

        }

        return s.substring(minStart, minEnd + 1);


    }
}
