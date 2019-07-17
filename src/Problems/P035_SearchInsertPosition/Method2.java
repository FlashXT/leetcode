package Problems.P035_SearchInsertPosition;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/17 10:53;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method2 {
    public int searchInsert(int[] nums, int target) {
        int index = binarySearch(nums,0,nums.length-1,target);

        return index;
    }

    public static int binarySearch(int [] nums,int start,int end,int target){
        if(start > end) {
            return start;
        }
        int mid = start+(end -start)/2;
        if(nums[mid] == target)
            return mid;
        else if(nums[mid] > target)
            return binarySearch(nums,start,mid-1,target);
        else
            return binarySearch(nums,mid+1,end,target);
    }
}
