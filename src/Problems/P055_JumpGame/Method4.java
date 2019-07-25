package Problems.P055_JumpGame;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/25 19:12;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//判断 0 前边的元素能否跳过 0 ，不需要每次都向前查找，我们只需要用一个变量保存
// 当前能跳的最远的距离，然后判断最远距离和当前 0 的位置就可以了。
public class Method4 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length-1;i++){
          if(nums[i] == 0 && i >= max){
              return false;

          }
          max = Math.max(max,nums[i]+i);

        }
        return true;
    }

}
