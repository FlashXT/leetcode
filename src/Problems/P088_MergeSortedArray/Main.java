package Problems.P088_MergeSortedArray;

import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date: 2019/8/10 8:40
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        new Method1().merge(nums1,3,nums2,3);
    }
}
