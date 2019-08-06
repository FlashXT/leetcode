package Problems.P078_SubSets;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/6 10:51;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//https://leetcode.wang/leetCode-78-Subsets.html
public class Method2 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        res.add(new ArrayList<>(temp));
        for(int i = 0; i<nums.length;i++){
            List<List<Integer>> res_temp = new ArrayList<>();
            for(List<Integer> list:res){
                List<Integer> tlist = new ArrayList<>(list);
                tlist.add(nums[i]);
                res_temp.add(tlist);
            }
            res.addAll(res_temp);
        }
        return res;
    }
}
