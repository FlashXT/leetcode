package Problems.P033_SearchinRotatedSortedArray;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/16 8:55;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//拓展：旋转数组中的最小值
public class OneMore {
    public int searchMin(int[] nums) {
        int start = 0,end = nums.length-1;
        while(start < end){
            int mid = start +(end - start)/2;
            if(nums[mid] > nums[end])
                start = mid+1;
            else if(nums[mid] == nums[end])
                end = end-1;
            else{
                end = mid;
            }
        }
        return nums[start];
    }
}
