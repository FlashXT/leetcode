package Problems.P053_MaximumSubarray;

import java.util.*;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/21 19:39;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int [] maxsum = new int [nums.length+1];
        maxsum[0] = nums[0];
        for(int i = 1; i<nums.length;i++){
            if(maxsum[i-1]+ nums[i] >=0){
                maxsum[i]=maxsum[i-1]+nums[i];
            }
            else{
                maxsum[i]= nums[i]>0?nums[i]:0;
            }

            res = res > maxsum[i] ? res:maxsum[i];
        }
        return res;
    }
}
