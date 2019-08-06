package Problems.P090_SubSets2;

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
    private List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> subsets(int[] nums) {
        for(int i = 0; i <= nums.length;i++){
            Combinations(nums,0,i,new ArrayList<>());
        }
        for(int i = 0; i< res.size();i++){
            for(int j = 0;j < res.get(i).size();j++){
                System.out.print(res.get(i).get(j)+"\t");
            }
            System.out.println();
        }
        return res;
    }
    private void Combinations(int [] nums , int index,int k,List<Integer> temp){
        if(temp.size() == k){
//            if(!isIn(res,temp))
                res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=index;i < nums.length- (k - temp.size())+1;i++){
            temp.add(nums[i]);
            Combinations(nums,i+1,k,temp);
            temp.remove(temp.size()-1);
        }
    }


}
