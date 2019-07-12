package Problems.P026_RemoveDuplicatesfromSortedArray;

import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/12 14:22;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
     int [] nums = {0,0,1,1,2,2,3,3,4,5,6};
     new Method1().removeDuplicates(nums);
     System.out.println(Arrays.toString(nums));
    }
}
