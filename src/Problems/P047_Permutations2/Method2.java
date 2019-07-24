package Problems.P047_Permutations2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/24 14:29;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//在Method1的基础上删除去重，直接对res去重
public class Method2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(nums[0]);
        //先放入第一个元素
        res.add(temp);
        //从第二个元素开始插入
        for(int i = 1; i < nums.length;i++){
            //计算res中右几个list需要插入
            int current_size = res.size();
            //对res中的每个list进入插入
            for(int k = 0; k < current_size;k++){
                List<Integer> list = new ArrayList<>(res.get(k));
                //对每个位置进行插入元素
                for(int j = 0;j <= i;j++){
                    temp = new ArrayList<>(list);
                    temp.add(j,nums[i]);
                    res.add(temp);
                }
            }
            for(int j = 0; j<current_size;j++)
                res.remove(0);
        }
        res = removeDuplicate(res);
        for(int i = 0; i < res.size();i++){
            for(int j = 0; j< res.get(i).size();j++)
                System.out.print(res.get(i).get(j)+"\t");
            System.out.println();
        }
        return res;
    }
    private List<List<Integer>> removeDuplicate(List<List<Integer>> list) {
        Set<String> ans = new HashSet<String>();
        for (int i = 0; i < list.size(); i++) {
            List<Integer> temp = list.get(i);
            String key = "";

            for (int j = 0; j < temp.size() - 1; j++) {
                key = key + temp.get(j) + ",";
            }
            key = key + temp.get(temp.size() - 1);
            ans.add(key);
        }

        // 根据逗号还原 List
        List<List<Integer>> ans_list = new ArrayList<List<Integer>>();
        for (String k : ans) {
            String[] l = k.split(",");
            List<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < l.length; i++) {
                int c = Integer.parseInt(l[i]);
                temp.add(c);
            }
            ans_list.add(temp);
        }
        return ans_list;
    }

}
