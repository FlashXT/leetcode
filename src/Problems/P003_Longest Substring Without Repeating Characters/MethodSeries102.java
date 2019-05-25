package Algo003;

import java.util.HashSet;
import java.util.Set;

public class MethodSeries102 {

    public int lengthOfLongestSubstring(String s) {

        int maxlen = 0;
        for(int i = 0;i < s.length();i++){
            for(int j = i+1; j <= s.length();j++){

                if (NoRepeatingChars(s,i,j) && j-i+1  > maxlen)
                    maxlen = j-i;
            }
        } 	return maxlen;

    }

    public static boolean NoRepeatingChars(String s,int head, int tail){
        Set<Character> set = new HashSet<Character>();
        for(int i= head ; i < tail; i ++)
        {
            if (set.contains(s.charAt(i))){
                return false;
            }
            else{
                set.add(s.charAt(i));
            }
        }
        return true;
    }

}
