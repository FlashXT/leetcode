package Problems.P005_LongestPalindromicSubstring;

public class Method1 {

    //时间复杂度O(n^3)
    public static String longestPalindrome(String s) {
        String str = "";
        //遍历字符串s长度为l的子串
        for(int l = 1; l <= s.length();l++){
            for(int i = 0; i+l-1 < s.length() ;i++){
                int j = i+l;
                if(isPalindrome(s.substring(i,j)) > str.length() )
                    str = s.substring(i,j);
            }
        }
        return str;
    }

    //判断字符串s是否为回文串
    public static int isPalindrome(String s){
        int len = s.length();
        for(int i = 0;i < len/2;i++){
            if(s.charAt(i) == s.charAt(len-1-i));
            else return -1;
        }
        return s.length();
    }
}
