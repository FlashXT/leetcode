package Problems.P40_CombinationSumII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/18 17:16;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> result = new ArrayList<>();
        combinationSum(res,candidates,target,result,0);
        return res;

    }
    private void combinationSum(List<List<Integer>> res,int[] candidates, int target,List<Integer> result,int index) {
        if(target == 0){
            Collections.sort(result);

            if(!isIn(res,result)){
                res.add(new ArrayList<>(result));
                System.out.println(Arrays.toString(result.toArray()));
            }

            return ;
        }
        for(int i = index; i<candidates.length;i++){
            if(target - candidates[i]>=0){
                result.add(candidates[i]);
                combinationSum(res,candidates,target-candidates[i],result,i+1);
                result.remove((Integer) candidates[i]);
            }

        }

    }
    private boolean isIn(List<List<Integer>> res,List<Integer> result){

        for(int i = 0; i< res.size();i++){
            if(res.get(i).size() == result.size()){
                Collections.sort(res.get(i));
                Collections.sort(result);
                int j = 0;
                for(; j < result.size();j++){
                    if(res.get(i).get(j)!=result.get(j)){
                        break;
                    }
                }
                if(j== result.size())
                    return true;
            }
        }
        return false;
    }

}
