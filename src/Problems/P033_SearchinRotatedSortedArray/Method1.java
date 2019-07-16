package Problems.P033_SearchinRotatedSortedArray;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/16 8:15;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target == nums[mid])
                return mid;
            //[start,mid]在一个有序段上
            else if(nums[start]<= nums[mid]){
                if(target >= nums[start] && target < nums[mid])
                    end = mid-1;
                else
                    start = mid+1;
            //[start,mid]跨段
            }else{
                if(target < nums[mid])
                    end = mid-1;
                else{
                    if( target <= nums[end])
                        start = mid+1;
                    else
                        end = mid -1;

                }

            }
        }
        return -1;
    }
}
