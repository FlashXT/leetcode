package Problems.P046_Permutations;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/24 15:10;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//插入法
public class Method2 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res  = permute(nums,nums.length-1);
//        for(int i = 0; i < res.size();i++){
//            for(int j = 0; j< res.get(i).size();j++)
//                System.out.print(res.get(i).get(j)+"\t");
//            System.out.println();
//        }
        return res;
    }
    //end表示当前新增数字的位置
    private List<List<Integer>> permute(int[] nums,int end) {
        if(end == 0){
            List<List<Integer>> res  = new ArrayList<>();
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[0]);
            res.add(temp);
            return res;
        }
        //得到上次所有的结果
        List<List<Integer>> res  = permute(nums,end-1);
        int current_size = res.size();
        //遍历每一种情况
        for(int i = 0 ; i < current_size;i++){
            for(int k = 0; k <=end;k++){
                List<Integer> temp = new ArrayList<>(res.get(i));
                temp.add(k,nums[end]);
                res.add(temp);
            }
        }
        for(int j =0 ; j < current_size;j++)
            res.remove(0);
        return res;
    }
}