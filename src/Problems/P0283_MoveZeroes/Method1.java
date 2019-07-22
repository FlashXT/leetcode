package Problems.P0283_MoveZeroes;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/22 9:42;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public void moveZeroes(int[] nums) {
        int index1 = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i]!=0){
                swap(nums,index1++,i);
            }
        }
    }
    public void swap(int [] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;

    }

}
