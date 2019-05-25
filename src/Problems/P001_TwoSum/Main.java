package Problems.P001_TwoSum;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/25 8:55;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/

import java.util.Arrays;

/*****************************************************************
 * Given an array of integers, return indices of the two numbers
 * such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * Example:
 *
 *      Given nums = [2, 7, 11, 15], target = 9,
 *
 *      Because nums[0] + nums[1] = 2 + 7 = 9,
 *      return [0, 1]. //返回按照索引大小顺序
 ******************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums = {2,7,11,15};
        System.out.println(Arrays.toString(Method1.twoSum(nums,13)));
    }
}
