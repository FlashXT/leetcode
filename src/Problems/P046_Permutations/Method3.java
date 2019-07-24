package Problems.P046_Permutations;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/24 15:57;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method3{
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
            //每个list的插入位置个数
            for(int j = 0; j <= i;j++){
                //对res中的每个list在j位置插入元素
                for(int k = 0; k < current_size;k++){
                    List<Integer> list = new ArrayList<>(res.get(k));
                    list.add(j,nums[i]);
                    res.add(list);
                }
            }
            for(int j = 0; j<current_size;j++)
                res.remove(0);
        }
        for(int i = 0; i < res.size();i++){
            for(int j = 0; j< res.get(i).size();j++)
                System.out.print(res.get(i).get(j)+"\t");
            System.out.println();
        }
        return res;

    }
}
