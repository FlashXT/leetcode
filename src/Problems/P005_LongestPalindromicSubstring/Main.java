package Problems.P005_LongestPalindromicSubstring;


public class Main {
    public static void main(String [] args)
    {
        String s = "aba435cba";
        String str = new Method2().longestPalindrome(s);
        System.out.println(str);
    }
}
