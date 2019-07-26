package Problems.P057_InsertInterval;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/26 14:55;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static  void main(String [] args){
        int [] [] nums = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        new Method1().insert(nums,new int[]{4,8});
    }
}
