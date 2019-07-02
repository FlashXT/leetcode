package Problems.P011_ContainerWithMostWater;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/6/27 9:33;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public int maxArea(int[] height) {
        int len = height.length;
        int max = Math.min(height[len-1],height[0])* (len-1);
        int i = 0,j =len-1;
        while( i < j){
            if (height[i] <= height[j]){
                i++;
            }
            else
                j--;
            int temp = Math.min(height[j],height[i])* (j-i);
            if (temp > max)
                max = temp;
        }
        return max;
    }
}
