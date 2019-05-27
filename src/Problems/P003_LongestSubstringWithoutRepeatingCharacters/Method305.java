package Algo003;

public class Method305 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        int i = 0,j = 0;

        while( j < n){
            Character ch = s.charAt(j);
            i = Math.max(index[ch],i);
            ans = Math.max(ans, j-i+1);
            index[ch] = j+1;
            j++;
        }
        return ans;
    }

}
