package Problems.P042_TrappingRainWater;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/19 16:30;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//按列处理
public class Method2 {
    public int trap(int[] height) {
        int res = 0;
        for(int i = 1 ; i< height.length-1;i++){
            //找出左边最高的柱子
            int max_left = 0;
            for(int j = 0; j< i; j++){
                max_left = max_left > height[j]?max_left:height[j];
            }
            //找出右边最高的柱子
            int max_right = 0;
            for(int j = i+1; j< height.length; j++){
                max_right = max_right > height[j]?max_right:height[j];
            }
            int h = max_left < max_right ? max_left:max_right;
            if( h > height[i])
                res += h-height[i];
        }
        return res;
    }
}
