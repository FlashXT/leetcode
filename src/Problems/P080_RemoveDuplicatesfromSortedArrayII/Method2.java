package Problems.P080_RemoveDuplicatesfromSortedArrayII;

import java.util.Arrays;

/*****************************************************************
 * @Author:turboMan;
 * @Date:19-8-7 上午9:58;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//left作为结果数组的索引，不同于滑动窗口的思想
public class Method2 {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = 1;
        int count = 1;
        for(;right < nums.length;right++){
            if(nums[right] == nums[left]){
              if(count < 2){
                  //当前数字个数小于2，left右移，并赋值，count值加1
                  left++;
                  nums[left] = nums[right];
                  count++;
              }
              //如果当前数字个数为2，left不动
            }
            //直到找到第一个不等于当前数字的数字，left右移，并赋值，count置为1，
            // 表示新数字的个数为1
            else{
                left++;
                nums[left]=nums[right];
                count=1;

            }
        }
        System.out.println(Arrays.toString(nums));
        return left+1;
    }
}
