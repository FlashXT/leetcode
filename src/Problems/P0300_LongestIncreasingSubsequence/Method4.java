package Problems.P0300_LongestIncreasingSubsequence;

import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/4,9:51
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//动态规划
public class Method4 {

    public int lengthOfLIS(int[] nums) {

        int [] memo = new int [nums.length];
        int len = 0;
        for(int i = 0; i < nums.length;i++){
            memo[i]=1;
            //j ->[i-1,0]比j->[0,i-1]更快，可以这样理解：j越接近i,memo[j]+1 >memo[i]
            // 的可能性就越大，因为[0,j]长度越长，子序列长度就可能越长；所以在j->[i-1,0]
            // 这样循环，在[0,i-1]的后一段[i-1,k]更新了memo[i],[0,i-1]的前一段[k,0]跟
            // 新memo[j]+1 >memo[i]的概率较小，减少了一部分更新memo[i]的操作，所以更快。
            for(int j = i-1; j >=0;j--){
                if(nums[i] > nums[j])
                    memo[i] = memo[j]+1 > memo[i]?memo[j]+1:memo[i];
            }
            //更新memo数组的过程中找到其最大值
            len = len < memo[i]?memo[i]:len;
        }
//        System.out.println(len);
        return len;
    }
}
