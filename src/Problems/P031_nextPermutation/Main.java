package Problems.P031_nextPermutation;

import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/15 8:33;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums = {1};
        new Method1().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
