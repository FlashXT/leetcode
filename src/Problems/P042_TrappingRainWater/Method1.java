package Problems.P042_TrappingRainWater;

import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/19 11:20;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//按层处理，计算每一层的存水量之和，然后按层求和；
public class Method1 {
    public int trap(int[] height) {
        int max = Integer.MIN_VALUE;
        //找到最高的柱子
        for(int i = 0; i < height.length;i++){
            max = height[i] > max ? height[i]:max;
        }
        //res保存结果
        int res = 0;
        int i = 1;
        //按层处理
        while(i <= max){
            //left表示每层开始的左边界，right表示每层处理的右边界；
            int left = -1;
            int right = -1;
            for(int k = 0; k < height.length-1;k++){
                if(height[k] > 0&& height[k+1]< height[k]){
                    left = k;break;
                }
            }
            for(int k =  height.length-1; k >0;k--){
                if(height[k] > 0&& height[k-1] < height[k]){
                    right = k;break;
                }
            }
            //如果该层不满足条件，直接退出循环
            if(left <0 || right< 0)
                break;
            int j =left;
            while(j < right){
                if(height[j]==0){
                    res++;
                }
                j++;
            }
            //所有层高度减1
            j= 0;
            while(j < height.length){
                height[j]--;
                if(height[j] < 0)
                    height[j]=0;
                j++;
            }
            //下一层
            i++;
        }
        return res;
    }
}
