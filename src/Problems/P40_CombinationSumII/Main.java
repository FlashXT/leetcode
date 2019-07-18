package Problems.P40_CombinationSumII;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/18 17:15;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static  void main(String [] args){
        int []candidates={4,4,2,1,4,2,2,1,3};
        int target = 6;
        new Method1().combinationSum2(candidates,target);
    }
}
