package Problems.P005_LongestPalindromicSubstring;


public class Main {
    public static void main(String [] args)
    {
        String s = "cbbbdsss";
        String str = new Method1().longestPalindrome(s);
        System.out.println(str);
    }
}
