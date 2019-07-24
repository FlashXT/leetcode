package Problems.P045_JumpGame2;

import org.omg.PortableInterceptor.INACTIVE;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/24 8:00;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//递归回溯运行超时
public class Method1 {
    private int minsteps = Integer.MAX_VALUE;
    public int jump(int[] nums) {
        jump(nums,0,0);
        return minsteps;
    }
    private void jump(int[] nums,int index,int steps) {
        if(index >= nums.length-1){
            if(index == nums.length-1)
                minsteps = minsteps > steps?steps:minsteps;
            return;
        }
        for(int i = 1;i <= nums[index];i++){
            index+=i;
            jump(nums,index,steps+1);
            //回溯
            index-=i;
        }
    }
}
