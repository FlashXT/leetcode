package Algo005;

public class Baseline {

    public static String longestPalindrome(String s) {
        String str = "";
        for(int i = 0; i<s.length();i++){
            for(int j=i+1; j <= s.length() ;j++){

                if(isPalindrome(s.substring(i,j)) > str.length() )
                    str = s.substring(i,j);
            }
        }
        return str;
    }

    public static int isPalindrome(String s){
        int len = s.length();
        for(int i = 0;i < len/2;i++){
            if(s.charAt(i) == s.charAt(len-1-i));
            else return -1;
        }
        return s.length();
    }
}
