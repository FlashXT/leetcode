package Problems.P084_LargestRectangleinHistogram;

import java.util.HashSet;

/*****************************************************************
 * @Author:FlashXT;
 * @Date: 2019/8/10 10:25
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//暴力解法O(n^2)，勉强通过
public class Method2 {
    public int largestRectangleArea(int[] heights) {
        HashSet<Integer> heightsSet = new HashSet<Integer>();
        //得到所有的高度，也就是去重。
        for (int i = 0; i < heights.length; i++) {
            heightsSet.add(heights[i]);
        }
        int maxArea = 0;
        //遍历每一个高度
        for (int h : heightsSet) {
            int width = 0;
            int maxWidth = 1;
            //找出连续的大于等于当前高度的柱形个数的最大值
            for (int i = 0; i < heights.length; i++) {
                if (heights[i] >= h) {
                    width++;
                    //出现小于当前高度的就归零，并且更新最大宽度
                } else {
                    maxWidth = Math.max(width, maxWidth);
                    width = 0;
                }
            }
            maxWidth = Math.max(width, maxWidth);
            //更新最大区域的面积
            maxArea = Math.max(maxArea, h * maxWidth);
        }
        return maxArea;
    }

}
