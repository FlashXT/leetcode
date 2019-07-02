package Problems.P011_ContainerWithMostWater;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/6/27 9:33;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method2 {
    public int maxArea(int[] height) {

        int max = Integer.MIN_VALUE;
        int i = 0,j =height.length-1;
        while( i < j){
            max = Math.max(max,Math.min(height[j],height[i])* (j-i));
            if (height[i] <= height[j]){
                i++;
            }
            else
                j--;

        }
        return max;
    }
}
