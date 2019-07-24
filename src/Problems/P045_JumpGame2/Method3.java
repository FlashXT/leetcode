package Problems.P045_JumpGame2;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/24 8:00;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//贪心O(n)
public class Method3 {

    public int jump(int[] nums) {
        int end = 0;
        int maxposition = 0;
        int steps=0;
        for(int i=0;i < nums.length-1;i++){
            maxposition = Math.max(maxposition,nums[i]+i);
            if(i==end){
                end = maxposition;
                steps++;
            }
        }
        return steps;
    }

}
