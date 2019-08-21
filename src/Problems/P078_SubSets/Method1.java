package Problems.P078_SubSets;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/6 10:09;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//递归回溯法
public class Method1 {
    public List<List<Integer>> subsets(int [] nums){
        List<List<Integer>> res = new ArrayList<>();
        Combinations(nums,0,new ArrayList<>(),res);
        for(int i = 0;  i < res.size();i++){
            System.out.println(res.get(i));
        }

        return res;
    }
    private void Combinations(int [] nums , int index,List<Integer> temp,List<List<Integer>> res){
        res.add(new ArrayList<>(temp));
        for(int i=index;i < nums.length;i++){
            temp.add(nums[i]);
            Combinations(nums,i+1,temp,res);
            temp.remove(temp.size()-1);
        }
    }

}
