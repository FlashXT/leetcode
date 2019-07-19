package Problems.P041_FirstMissingPositive;

import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/19 10:17;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//基于桶排序的思想，原地交换排序,目标是调整数组为nums[i]=i+1
public class Method2 {
    public int firstMissingPositive(int[] nums) {
        for(int i = 0; i < nums.length;i++){

            while(nums[i]>0 && nums[i] <= nums.length&& nums[i]!=nums[nums[i]-1]){
                //nums[i]!=nums[nums[i]-1]用来保证不会将两个相等的数进行交换，避免造成死循环
                swap(nums,i,nums[i]-1);
            }

        }
        for(int i = 0; i < nums.length;i++)
        {
            if(nums[i]!=i+1)
                return i+1;
        }

        return nums.length+1;

    }
    public void swap(int[] nums,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
