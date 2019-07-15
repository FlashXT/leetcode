package Problems.P031_nextPermutation;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/15 8:33;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public void nextPermutation(int[] nums) {
        int i = nums.length-1;
        while(i > 0){
            if(nums[i-1] >= nums[i])
                i--;
            else
                break;
        }
        if(i == 0){
            sort(nums,0);
            return;
        }
        int pos = i;

        while(pos < nums.length){
            if(nums[i-1]< nums[pos] ){
               pos++;
            }
            else{
                break;
            }
        }
        swap(nums,i-1,pos-1);
        sort(nums,i);
    }
    public void sort(int [] nums,int start){
        int i = start;
        int j = nums.length-1;
        while(i <j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    public void swap(int [] nums,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
