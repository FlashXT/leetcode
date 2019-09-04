package Problems.P0300_LongestIncreasingSubsequence;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/4,9:51
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//递归超时
public class Method2 {
    private int res = 1;
    public int lengthOfLIS(int[] nums) {
        if(nums.length < 2) return nums.length;
        res = 1;
        //寻找从每个索引位置开始，最长的递增子序列
        for(int i = 0; i < nums.length;i++)
            lengthOfLIS(nums,Integer.MIN_VALUE,i,0);
        return res;
    }
    public void lengthOfLIS(int[] nums,int prev,int curpos,int len) {

        if(curpos == nums.length){
            res = res < len ? len:res;
            return ;
        }
        for(int i = curpos; i < nums.length;i++){
            if(nums[i] > prev)
                lengthOfLIS(nums,nums[i],i+1,len+1);
            else
                lengthOfLIS(nums,prev,i+1,len);
        }

    }
}
