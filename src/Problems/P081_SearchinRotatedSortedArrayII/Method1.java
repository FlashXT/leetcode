package Problems.P081_SearchinRotatedSortedArrayII;

/*****************************************************************
 * @Author:turboMan;
 * @Date:19-8-7 上午11:10;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while( left <= right){
            int mid = left+(right - left)/2;
            if(nums[mid] == target)
                return true;
            //mid 和 left处于同一段
            else if(nums[left] < nums[mid]){
                if(target >= nums[left] && target < nums[mid])
                  right = mid-1;
                else
                  left = mid+1;
            }
            else if(nums[left] == nums[mid])
                left++;
            // mid 和 left处于不同段
            else{
                if(target > nums[mid] && target <= nums[right] )
                    left = mid+1;
                else{
                    right = mid-1;
                }
            }
        }
        return false;
    }
}
