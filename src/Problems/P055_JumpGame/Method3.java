package Problems.P055_JumpGame;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/25 19:12;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//让我们直击问题的本质，与 45 题不同，我们并不需要知道最小的步数，所以我们对跳
// 的过程并不感兴趣。并且如果数组里边没有 0，那么无论怎么跳，一定可以从第 0 个
// 跳到最后一个位置。
// 所以我们只需要看 0 的位置，如果有 0 的话，我们只需要看 0 前边的位置，能不能
// 跳过当前的 0 ，如果 0 前边的位置都不能跳过当前 0，那么直接返回 false。如果
// 能的话，就看后边的 0 的情况。
public class Method3 {
    public boolean canJump(int[] nums) {
      for(int i = 0; i < nums.length-1;i++){
          if(nums[i] == 0){
              int j = i-1;
              boolean isCanJumpZero = false;
              while( j >= 0){
                  if(j +nums[j] > i){
                      isCanJumpZero = true;
                      break;
                  }
                  j--;
              }
              if(!isCanJumpZero)
                  return false;
          }

      }
      return true;
    }

}
