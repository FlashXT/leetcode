package Problems.P016_3SumClosest;

import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/8 14:46;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method2 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sub=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int lo=i+1,hi=nums.length-1;
            while(lo<hi){
                if(Math.abs((nums[lo]+nums[hi]+nums[i]-target))<sub){
                    sum=nums[lo]+nums[hi]+nums[i];
                    sub=Math.abs(sum-target);
                }
                if(nums[lo]+nums[hi]+nums[i]>target){
                    hi--;
                }else{
                    lo++;
                }
            }
        }
        return sum;
    }
}
