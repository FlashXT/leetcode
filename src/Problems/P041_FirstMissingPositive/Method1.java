package Problems.P041_FirstMissingPositive;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/19 9:04;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//使用桶排序,但是空间复杂度是O(max(nums)),无法运行通过
public class Method1 {
    public int firstMissingPositive(int[] nums) {
        if(nums.length == 0) return 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length;i++){
            if(nums[i] > max)
                max = nums[i];
        }
        int [] temp = new int[max+1];
        for(int i = 0; i<temp.length;i++){

           temp[i]=-1;
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i] >=0)
                temp[nums[i]]=nums[i];
        }
        for(int i = 1;i<temp.length;i++){
            if(temp[i] == -1)
                return i;
        }
        return temp.length;
    }

}
