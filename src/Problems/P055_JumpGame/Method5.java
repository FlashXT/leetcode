package Problems.P055_JumpGame;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/25 19:12;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//甚至不需要考虑 0 的位置，只需要判断最大距离有没有超过当前的 i 。
public class Method5 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length;i++){
          if(i > max){
              return false;
          }
          max = Math.max(max,nums[i]+i);
        }
        return true;
    }

}
