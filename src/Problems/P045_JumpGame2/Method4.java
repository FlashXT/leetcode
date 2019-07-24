package Problems.P045_JumpGame2;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/24 8:00;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//Method2改进算法O(n^2)
public class Method4 {

    public int jump(int[] nums) {

        int steps = 0;
        int index = nums.length-1;
        while(index !=0){
            for(int j = 0; j<index;j++){

                if(nums[j] >= index-j){
                    index = j;
                    steps++;
                    break;
                }

            }
        }

        return steps;
    }

}
