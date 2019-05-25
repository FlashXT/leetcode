package Algo003;

import java.util.HashMap;
import java.util.Map;

public class MethodSeries302 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <=1) return n;
        Map<Character,Integer> map = new HashMap<>();
        int ans = 0;
        int i = 0,j=0;
        int flag;
        s = s + s.charAt(n-1);
        while( j <= n){
            Character ch = s.charAt(j);
            if (!map.containsKey(ch))
                map.put(ch,j);
            flag = map.get(ch);
            if(  flag != j && flag >=i ){

                ans = Math.max(ans, j-i);
                i = flag+1;

            }
            map.replace(ch,j);
            j++;
        }
        return ans;
    }
}
