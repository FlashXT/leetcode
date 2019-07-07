package Problems.P014_LongestCommonPrefix;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/7 8:59;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//二分法递归
public class Method3 {
    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0) return "";
        return LCP(strs,0,strs.length-1);

    }
    public String LCP(String [] strs, int start, int end){
        if (start >  end ) return "";
        if (start == end ) return strs[start];
        int mid = (start + end)/2;
        String leftlcp = LCP(strs,start,mid);
        String rightlcp = LCP(strs,mid+1,end);
        return commonPrefix(leftlcp,rightlcp);
    }
    public String commonPrefix(String word1,String word2){
        int len = Math.min(word1.length(),word2.length());
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < len; i++){
            if(word1.charAt(i) == word2.charAt(i))
                res.append(word1.charAt(i));
            else
                break;
        }
        return res.toString();
    }
}
