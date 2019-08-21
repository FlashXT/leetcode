package Problems.P090_SubSetsII;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/6 10:09;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//递归回溯法
public class Method1 {
    public List<List<Integer>> subsetsWithDup(int [] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        subsets2(nums,0,new ArrayList<>(),res);
        for(int i = 0; i < res.size();i++){
            System.out.println(res.get(i));
        }
        return res;
    }
    private void subsets2(int [] nums ,int index,List<Integer> temp,List<List<Integer>> res){
        res.add(new ArrayList<>(temp));

        for(int i = index; i < nums.length;i++){
            if(i==index ||i > index && nums[i] != nums[i-1]){
                temp.add(nums[i]);
                subsets2(nums,i+1,temp,res);
                temp.remove(temp.size()-1);
            }

        }
    }


}
