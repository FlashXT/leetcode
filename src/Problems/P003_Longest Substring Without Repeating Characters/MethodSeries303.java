package Algo003;

import java.util.HashMap;
import java.util.Map;

public class MethodSeries303 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <=1) return n;
        Map<Character,Integer> map = new HashMap<>();
        int ans = 0;
        int i = 0,j=0;
        s = s + s.charAt(n-1);
        while( j <= n){
            Character ch = s.charAt(j);
            if (map.containsKey(ch)){
                ans = Math.max(ans, j-i);
                i = Math.max(map.get(ch)+1,i);
            }
            map.put(ch,j);
            j++;

        }

        return ans;
    }
}
