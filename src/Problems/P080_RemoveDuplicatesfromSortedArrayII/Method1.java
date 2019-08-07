package Problems.P080_RemoveDuplicatesfromSortedArrayII;

import java.util.Arrays;

/*****************************************************************
 * @Author:turboMan;
 * @Date:19-8-7 上午8:55;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//滑动窗口
public class Method1 {
    public int removeDuplicates(int[] nums) {
        int index1 = 0,index2 = 0;
        while(index2 < nums.length){
            //扩展右边界
            while(index2 < nums.length && nums[index1] == nums[index2]){
                 index2 ++;
            }
            //收缩左边界，分两种情况
            //①当前数字个数大于2
            if(index2 - index1 + 1 >= 3){
                index1+=2;
                while(index1 <index2)
                    nums[index1++]=Integer.MAX_VALUE;
            }
            //②当前数字个数小于等于2
            else
                index1=index2;
            index2++;

        }
        Arrays.sort(nums);
        int res = 0;
        while(res < nums.length){
            if(nums[res] < Integer.MAX_VALUE){
                res++;
            }
            else{
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
        return res;
    }
}
