package Problems.P015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/8 13:39;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//双指针法O(n^2)
public class Method2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int m = i + 1, n = nums.length - 1;
                while (m < n) {
                    if (nums[m] + nums[n] == -nums[i]) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[m]);
                        temp.add(nums[n]);
                        res.add(temp);
                        //元素相同要后移，防止加入重复的 list
                        while (m < n && nums[m] == nums[m + 1]) m++;
                        while (m < n && nums[n] == nums[n - 1]) n--;
                        m++;
                        n--;
                    } else if (nums[m] + nums[n] > -nums[i])
                        n--;
                    else
                        m++;
                }
            }
        }

        return res;
    }

}
