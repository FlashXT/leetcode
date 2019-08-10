package Problems.P088_MergeSortedArray;

import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date: 2019/8/10 8:40
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] res = new int[nums1.length];
        int index1 = 0;
        int index2 = 0;
        int i = 0;
        while(index1 < m && index2 < n){
            if(nums1[index1] < nums2[index2]){
                res[i++] = nums1[index1++];
            }
            else
                res[i++] = nums2[index2++];

        }
        while(index1 < m)
            res[i++] = nums1[index1++];
        while(index2 < n)
            res[i++] = nums2[index2++];

        for(i = 0 ;i < nums1.length;i++)
            nums1[i] = res[i];
        System.out.println(Arrays.toString(nums1));
    }
}
