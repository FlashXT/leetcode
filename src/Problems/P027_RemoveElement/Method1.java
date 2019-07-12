package Problems.P027_RemoveElement;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/12 14:35;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public int removeElement(int[] nums, int val) {
        int point = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] != val){
                nums[point] =nums[i];
                point++;
            }

        }
        return point;
    }
}
