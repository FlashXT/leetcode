package Problems.P042_TrappingRainWater;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/19 16:30;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//Method3的基础上降低空间复杂度，max_left数组压缩，max_right需要从右往左处理，
// 所以压缩较为麻烦
public class Method4 {
    public int trap(int[] height) {
        int res = 0;
        int max_left=-1;
        int [] max_right=new int [height.length];
        for(int i = height.length-2 ; i >= 0;i--){
            max_right[i] = max_right[i+1] > height[i+1]?max_right[i+1]:height[i+1];
        }
        for(int i = 1; i< height.length-1;i++){
            max_left = max_left > height[i-1]?max_left:height[i-1];
            int min = Math.min(max_left,max_right[i]);
            if (min > height[i])
                res+= (min - height[i]);
        }
        return res;
    }
}
