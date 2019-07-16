package Problems.P034_FindFirstandLastPositionofElementinSortedArray;

import java.util.ArrayList;
import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/16 10:18;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums = {3,3,3,3,3};
        int [] ans = new Method1().searchRange(nums,2);
        System.out.println(Arrays.toString(ans));
    }

}
