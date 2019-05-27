package Problems.P003_LongestSubstringWithoutRepeatingCharacters;

public class Method1 {

    public static int lengthOfLongestSubstring(String s) {

        int maxlen = 0;
        String ch;
        for(int i = 0;i < s.length();i++){
            for(int j = i; j < s.length();j++){
                ch = SubString(s,i,j);

                if (NoRepeatingChars(ch) && ch.length() > maxlen)
                    maxlen = ch.length();
            }
        } 	return maxlen;

    }

    public static String SubString(String s,int head,int tail){
        String sub = "";
        int i = 0;
        while(i <= tail-head){
            sub = sub + s.charAt(i+head);
            i++;
        }
        return sub;
    }
    public static boolean NoRepeatingChars(String s){

        int len = s.length();
        char [] ch = s.toCharArray();
        int i = 0,j = 0;
        while( i < len){
            j = i + 1;
            while(j < len){
                if(ch[i] == ch[j])
                    return false;
                j++;
            }
            i++;
        }
        return true;
    }

}
