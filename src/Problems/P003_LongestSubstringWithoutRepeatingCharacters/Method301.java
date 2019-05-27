package Problems.P003_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;


public class Method301 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int i = 0,j= i+1;
        int flag;
        while( j <= n){
            flag = allUnique(s, i, j);
            if (flag < 0){
                ans = Math.max(ans, j - i);

            }
            else {
                i=flag+1;
            }
            j++;
        }

        return ans;
    }

    int allUnique(String s, int start, int end) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (map.containsKey(ch))
                return map.get(ch);
            map.put(ch,i);
        }
        return -1;
    }
}
