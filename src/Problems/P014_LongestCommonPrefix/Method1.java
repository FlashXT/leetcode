package Problems.P014_LongestCommonPrefix;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/7 8:11;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//水平比较法求公共前缀
public class Method1 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        StringBuilder res = new StringBuilder(strs[0]);
        for(int i = 1; i < strs.length;i++){
            res = twoWordLCP(res.toString(),strs[i]);
        }
        return res.toString();


    }
    public StringBuilder twoWordLCP(String word1,String word2) {
        int len = word1.length() < word2.length() ? word1.length():word2.length();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < len; i++){
            if(word1.charAt(i) == word2.charAt(i))
                res.append(word1.charAt(i));
            else
                break;
        }
        return res;
    }
}
