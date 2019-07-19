package Problems.P042_TrappingRainWater;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/19 16:30;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//按列处理改进，在找左右最高柱子时使用动态规划
//max_left[i]表示第i列左边最高的柱子，max_right[i]表示第i列右边最高的柱子
public class Method3 {
    public int trap(int[] height) {
        int res = 0;
        int [] max_left=new int [height.length];
        int [] max_right=new int [height.length];
        for(int i = 1; i < height.length-1; i++){
            max_left[i] = max_left[i-1] > height[i-1]?max_left[i-1]:height[i-1];
        }
        for(int i = height.length-2 ; i >= 0;i--){
            max_right[i] = max_right[i+1] > height[i+1]?max_right[i+1]:height[i+1];
        }
        for(int i = 1; i< height.length-1;i++){
            int min = Math.min(max_left[i],max_right[i]);
            if (min > height[i])
                res+= (min - height[i]);
        }
        return res;
    }
}
