package Problems.P001_TwoSum;

import java.util.HashMap;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/25 18:46;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//两遍遍历
public class Method1 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length;i++)
            map.put(nums[i],i);
        int index=0;
        for(int i = 0; i<nums.length;i++){
            if(map.get(target - nums[i])!=null){
                index = map.get(target-nums[i]);
                if(index!= i)
                    return new int[]{i,index};
            }

        }
        return null;
    }
}
