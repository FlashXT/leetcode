package Problems.P026_RemoveDuplicatesfromSortedArray;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/12 14:23;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public int removeDuplicates(int[] nums) {
        int point = 0;
        for (int i = 0, len = nums.length; i<len - 1; i++) {
            if (nums[i] != nums[i+1])
                point++;
            nums[point] = nums[i+1];
        }

        return point + 1;
    }
}
