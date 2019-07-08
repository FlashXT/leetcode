package Problems.P015_3Sum;

import java.util.*;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/8 13:39;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//暴力解法O(n^3*(3*len(res)))
public class Method1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        for(int i = 0; i < nums.length;i++){
            for(int j = i+1; j < nums.length;j++){
                for(int k = j +1; k < nums.length;k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        if(isIn(res,temp))
                            continue;
                        else
                            res.add(temp);
                    }


                }
            }
        }
        return res;
    }
    public boolean isIn(List<List<Integer>> res,List temp){
        boolean tempinList = false;
        for(int i = 0; i < res.size();i++){
            List<Integer> list = res.get(i);
            Collections.sort(list);
            Collections.sort(temp);
            tempinList = list.get(0)==temp.get(0);
            for(int j = 1; j < temp.size();j++){
                tempinList  =tempinList &&(list.get(j)==temp.get(j));
            }
            if (tempinList)
                return true;
        }
        return tempinList;
    }
}
