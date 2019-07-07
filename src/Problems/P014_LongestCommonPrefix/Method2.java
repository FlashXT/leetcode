package Problems.P014_LongestCommonPrefix;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/7 8:43;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//垂直方法
public class Method2 {
    public String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0) return " ";
        for(int i = 0; i < strs[0].length();i++){
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length;j++)
                if(i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0,i);
        }
        return strs[0];
    }
}
