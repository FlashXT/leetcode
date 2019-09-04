package Problems.P0300_LongestIncreasingSubsequence;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/4,9:51
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//递归,Time complexity : O(2^n),超时
public class Method1 {

    public int lengthOfLIS(int[] nums) {
        return lengthOfLIS(nums,Integer.MIN_VALUE,0);
    }
    public int lengthOfLIS(int[] nums,int prev,int curpos) {
        if(curpos == nums.length){
            return 0;
        }
        int taken = 0;
        if(nums[curpos] > prev)
            taken = 1+lengthOfLIS(nums,nums[curpos],curpos+1);

        int notaken = lengthOfLIS(nums,prev,curpos+1);

        return Math.max(taken,notaken);

    }
}
