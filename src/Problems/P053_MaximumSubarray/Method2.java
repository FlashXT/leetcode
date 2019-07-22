package Problems.P053_MaximumSubarray;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/21 19:39;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method2 {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        //maxsum[i]表示nums[0~i]的最大和
        int maxsum = nums[0];

        for(int i = 1; i<nums.length;i++){
            if(maxsum >0){
                maxsum=maxsum+nums[i];
            }
            else{
                maxsum= nums[i];
            }

            res = res > maxsum ? res:maxsum;
        }
        return res;
    }
}
