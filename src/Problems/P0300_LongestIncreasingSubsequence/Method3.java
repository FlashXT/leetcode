package Problems.P0300_LongestIncreasingSubsequence;

import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/4,9:51
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//动态规划
public class Method3 {

    public int lengthOfLIS(int[] nums) {
        if(nums.length < 2) return nums.length;
        //memo[i]表示以nums[i]结尾的最长递增子序列的长度
        int [] memo = new int [nums.length];
        for(int i = 0; i< memo.length;i++)
            memo[i]=1;
        int len = 0;
        for(int i = 0; i < nums.length;i++){
            for(int j = 0; j < i;j++){
                if(nums[i] > nums[j])
                    memo[i] = memo[j]+1 > memo[i]?memo[j]+1:memo[i];
            }
            //更新memo数组的过程中找到其最大值
            len = len < memo[i]? memo[i]:len;
        }
//        System.out.println(len);
        return len;
    }
}
