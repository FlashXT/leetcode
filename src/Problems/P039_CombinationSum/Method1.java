package Problems.P039_CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/18 15:14;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//回溯法
public class Method1 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> result = new ArrayList<>();
        combinationSum(res,candidates,target,result,0);
        return res;

    }
    private void combinationSum(List<List<Integer>> res,int[] candidates, int target,List<Integer> result,int index) {
        if(target == 0){
            Collections.sort(result);
//            System.out.println(Arrays.toString(result.toArray()));

            res.add(new ArrayList<>(result));
            return ;
        }
        for(int i = index; i<candidates.length;i++){
            if(target - candidates[i]>=0){
                result.add(candidates[i]);
                combinationSum(res,candidates,target-candidates[i],result,i);
                result.remove((Integer) candidates[i]);
            }

        }

    }
}
