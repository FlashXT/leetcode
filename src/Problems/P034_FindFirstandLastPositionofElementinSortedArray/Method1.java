package Problems.P034_FindFirstandLastPositionofElementinSortedArray;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/16 10:18;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public  int[] searchRange(int[] nums, int target){

        int start = 0,end = nums.length-1;
        int [] ans = {-1,-1};
        if(nums.length == 0) return ans ;
        while(start <= end){
            int mid = (start + end )/2;
            if(target == nums[mid]){
                end = mid-1;
            }
            else if(nums[mid] < target)
                start = mid +1;
            else
                end = mid -1;
        }
        if( start < nums.length && nums[start] == target)
            ans[0] = start;
        else
            return ans;
        start = 0;
        end = nums.length-1;

        while(start <= end){
            int mid = (start + end )/2;
            if(target == nums[mid]){
                start = mid+1;
            }
            else if(nums[mid] < target)
                start = mid +1;
            else
                end = mid -1;
        }
        ans[1]=end;
        return ans;
    }
}
