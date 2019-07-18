package Problems.P038_CountAndSay;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/18 14:47;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {

    public String countAndSay(int n) {
        if(n==1)
            return "1";
        String last = countAndSay(n-1);
        return getNextString(last);
    }
    private String getNextString(String last){
        if(last.length() == 0)
            return "";
        int num = getRepeatTimes(last);
        return num+""+last.charAt(0)+getNextString(last.substring(num));
    }
    private  int getRepeatTimes(String str){
        int count = 0;
        char target = str.charAt(0);
        for(int i =0 ; i < str.length();i++){
            if(str.charAt(i)==target)
                count++;
            else
                break;
        }
        return count;
    }

}
