package Problems.P018_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/10 8:30;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for(int i = 0; i < nums.length;i++){
            //防止重复
            if(i ==0 || (i > 0 && nums[i]!=nums[i-1])){

                for(int j = i+1; j < nums.length;j++){
                    if(j ==i+1 || nums[j]!=nums[j-1]){
                        int m = j+1,n = nums.length-1;
                        int sum = target-(nums[i]+nums[j]);
                        while(m < n){
                            if(nums[m] + nums[n] == sum){
                                res.add(Arrays.asList(nums[i], nums[j], nums[m], nums[n]));
                                while(m < n &&nums[m] == nums[m+1])
                                    m++;
                                while(m < n &&nums[n] == nums[n-1])
                                    n--;
                                m++;
                                n--;
                            }
                            else if (nums[m] + nums[n] < sum)
                                m++;
                            else
                                n--;
                        }
                    }

                }
            }
        }
    return res;
    }
}
