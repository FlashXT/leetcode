package Problems.P055_JumpGame;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/25 19:12;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/

//递归运行超时
public class Method1 {
    public boolean canJump(int[] nums) {
        return canJump(nums,0);
    }
    private boolean canJump(int[] nums,int index) {
        if(index >= nums.length-1)
            return true;
        for(int i = 1; i <= nums[index];i++){
            if(canJump(nums,index+i))
                return true;
        }
        return false;
    }
}
