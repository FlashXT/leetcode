package Problems.P055_JumpGame;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/25 19:12;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/

public class Method2 {
    public boolean canJump(int[] nums) {
       int end = 0;
       int maxposition = 0;

       for(int i = 0; i < nums.length-1;i++){
           //出现0的情况
           if(end < i)
               return false;
           maxposition = Math.max(maxposition,nums[i]+i);
           if(i == end){
               end = maxposition;

           }
       }
       return maxposition >= nums.length-1;
    }

}
