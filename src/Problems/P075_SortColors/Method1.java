package Problems.P075_SortColors;

//荷兰国旗问题
public class Method1 {
    public void sortColors(int[] nums) {
        if(nums.length <= 1) return ;
        int left = -1;
        int right = nums.length;

        for(int i = 0; i< right;i++){
            if(nums[i] > 1)
                //与右边界的数字交换后，需要对交换后的数字再判断一次(i之后可能有小于1的数字)，所以i--;
                swap(nums,i--,--right);
            else if(nums[i] < 1)
                //与左边界的数字交换后，不需要再判断一次，因为i左边的而数字一定<=1
                swap(nums,i,++left);

        }
        for(int k = 0; k< nums.length;k++)
            System.out.print(nums[k]+"\t");
    }
    public static  void swap(int []nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
