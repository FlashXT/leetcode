package Problems.P0283_MoveZeroes;

import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/22 9:42;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [ ]args){
        int [] nums={0,1,0,3,12};
        new Method1().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
