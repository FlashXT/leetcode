package Problems.P084_LargestRectangleinHistogram;

/*****************************************************************
 * @Author:FlashXT;
 * @Date: 2019/8/10 9:40
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//暴力解法O(n^3)，运行超时
public class Method1 {
    public int largestRectangleArea(int[] heights) {
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < heights.length;i++){
            for(int j = 0; j <= i;j++){
                int temp = (i-j+1)*min(heights,j,i);
                res = res < temp ? temp:res;
            }
        }
        return res;
    }
    public int min(int [] nums,int start,int end){
        int res = nums[start];
        for(int i = start+1; i <=end;i++){
            if(nums[i] < res){
                res = nums[i];
            }
        }
        return res;
    }
}
