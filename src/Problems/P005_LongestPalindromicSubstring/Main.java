package Problems.P005_LongestPalindromicSubstring;

import java.lang.reflect.Method;

public class Main {
    public static void main(String [] args)
    {
        String s = "abababa";
        String str = Method1.longestPalindrome(s);
        System.out.println(str);
    }
}
