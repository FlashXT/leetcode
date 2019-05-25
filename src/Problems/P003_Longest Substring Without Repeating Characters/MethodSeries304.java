package Algo003;

import java.util.HashMap;
import java.util.Map;

public class MethodSeries304 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {

                i = Math.max(map.get(s.charAt(j))+1, i);
            }
            ans = Math.max(ans, j - i+1);
            map.put(s.charAt(j), j);
        }
        return ans;
    }

}
