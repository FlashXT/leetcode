package Problems.P016_3SumClosest;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/8 14:44;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//暴力解法O(n^3)
public class Method1 {
    public int threeSumClosest(int[] nums, int target) {
        int sub = Integer.MAX_VALUE; //保存和 target 的差值
        int sum = 0; //保存当前最接近 target 的三个数的和
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++)
                for (int k = j + 1; k < nums.length; k++) {
                    if (Math.abs((nums[i] + nums[j] + nums[k] - target)) < sub) {
                        sum = nums[i] + nums[j] + nums[k];
                        sub = Math.abs(sum - target);
                    }
                }
        }
        return sum;
    }
}
