package Problems.P001_TwoSum;

import java.util.HashMap;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/25 18:46;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//一遍遍历，在创建HashMap时查找索引
public class Method2 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int index=0;
        for(int i = 0; i<nums.length;i++){
            if(map.get(target - nums[i])!=null){
                index = map.get(target-nums[i]);
                //index < i
                return new int[]{index,i};
            }
            //这种方法每次都是查找0~i之间的元素，假设nums [i] + nums[k] =target,
            //那么在遍历到数组的第i个元素时，找不到nums[k],此时map中还没放入nums[k],
            //将nums[i]放入HashMap,继续遍历，遍历到nums[k]时，返回[i,k];
            map.put(nums[i],i);
        }
        return null;
    }
}
