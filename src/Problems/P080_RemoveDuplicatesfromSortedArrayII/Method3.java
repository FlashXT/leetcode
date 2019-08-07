package Problems.P080_RemoveDuplicatesfromSortedArrayII;

import java.util.Arrays;

/*****************************************************************
 * @Author:turboMan;
 * @Date:19-8-7 上午9:58;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//Method2中，用一个变量 count 记录了末尾数字出现了几次。而由于给定的数组是有序的，
// 我们可以更直接。将当前快指针遍历的数字和慢指针指向的数字的前一个数字比较（也就是
// 满足条件的倒数第 2 个数），如果相等，因为有序，所有倒数第 1 个数字和倒数第 2 个
// 数字都等于当前数字，再添加就超过 2 个了，所有不添加，如果不相等，那么就添加。
public class Method3 {
    public int removeDuplicates(int[] nums) {
        int left = 1;
        int right = 2;
        int count = 2;
        for(;right < nums.length;right++){
            if(nums[right] != nums[left-count+1]){
             left++;
             nums[left] = nums[right];
            }
        }
        System.out.println(Arrays.toString(nums));
        return left+1;
    }
}
