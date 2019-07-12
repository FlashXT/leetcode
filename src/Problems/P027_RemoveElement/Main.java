package Problems.P027_RemoveElement;

import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/12 14:34;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [] nums = {0,1,2,3,4,5,6,6,6,7,8,9,4};
        int len = new Method1().removeElement(nums,4);
        System.out.println(len);
        System.out.println(Arrays.toString(nums));
    }

}
