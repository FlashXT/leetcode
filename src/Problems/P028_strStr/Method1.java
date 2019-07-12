package Problems.P028_strStr;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/12 14:54;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        for(int i = 0; i < haystack.length()-needle.length()+1;i++){

            if(haystack.charAt(i) == needle.charAt(0)){
                int index1 = i+1,index2 = 1;
                while(index2 < needle.length() && index1 < haystack.length()){
                    if(haystack.charAt(index1) == needle.charAt(index2)){
                        index1++;
                        index2++;

                    }
                    else
                        break;
                }
                if(index2==needle.length())
                    return i;

            }
        }
        return -1;
    }
}
