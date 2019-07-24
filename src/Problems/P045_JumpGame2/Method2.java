package Problems.P045_JumpGame2;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/24 8:00;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//贪心算法
public class Method2 {

    public int jump(int[] nums) {
        if(nums.length<2)return 0;
        //memo[i]表示从[0~i]的最小跳数
        int [] memo = new int[nums.length];
        memo[0]=0;
        memo[1]=1;
        for(int i = 0; i < nums.length;i++){

            for(int j = 0; j<i;j++){

                if(nums[j] >= i-j){
                    memo[i] = memo[j]+1;
                    continue;
                }

            }
        }
        return memo[memo.length-1];
    }

}
