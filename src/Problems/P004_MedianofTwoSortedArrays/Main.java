package Problems.P004_MedianofTwoSortedArrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/31 9:35;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums1 = {1,3,4,5,7,9,10};
        int [] nums2 = {2,3,7};
        double res = new Method1().findMedianSortedArrays(nums1,nums2) ;
        System.out.println(res);
    }
}
