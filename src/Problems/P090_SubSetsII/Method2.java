package Problems.P090_SubSetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/21,15:48
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method2 {
    public List<List<Integer>> subsetsWithDup(int [] nums){
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        Arrays.sort(nums);//排序
        int index = 0;
        for(int i = 0 ;i < nums.length;i++){
            List<List<Integer>> temp = new ArrayList<>();

            for(int j = 0; j < res.size();j++){
                List<Integer> temp2 = new ArrayList<>();
                //遇到重复数字时，跳过所有旧解，index之前的是旧解
                if(i > 0 && nums[i] == nums[i-1] && j < index)
                    continue;
                temp2.addAll(res.get(j));
                temp2.add(nums[i]);
                temp.add(temp2);
            }
            index = res.size();
            res.addAll(temp);

//            for(int k = 0; k < res.size();k++)
//                System.out.print(res.get(k)+"\t");
//            System.out.println();
        }
        return res;
    }
}
