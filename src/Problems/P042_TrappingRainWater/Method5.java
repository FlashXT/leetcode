package Problems.P042_TrappingRainWater;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/19 16:30;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//Method4的基础上降低空间复杂度，max_right数组压缩
public class Method5 {
    public int trap(int[] height) {
        int res = 0;
        int max_left = 0;
        int max_right = 0;
        int left = 1;                //左指针
        int right = height.length-2; //右指针
        for(int i = 1; i< height.length-1;i++){
            //从左到右更
            if (height[left - 1] < height[right + 1]) {
                max_left = Math.max(max_left, height[left - 1]);
                int min = max_left;
                if (min > height[left]) {
                    res = res + (min - height[left]);
                }
                left++;
            //从右到左更
            } else {
                max_right = Math.max(max_right, height[right + 1]);
                int min = max_right;
                if (min > height[right]) {
                    res = res + (min - height[right]);
                }
                right--;
            }
        }
        return res;
    }
}
