package Problems.P064_MinimumPathSum;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/31 16:08;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        int [][] nums = {{1,2},{5,6},{1,1}};
        int res = new Method2().minPathSum(nums);
        System.out.println(res);
    }

}
