package Problems.P0300_LongestIncreasingSubsequence;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/4,9:51
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums = {10,9,2,6,3,7,101,18};
        int res = new Method3().lengthOfLIS(nums);
        System.out.println(res);
    }
}
