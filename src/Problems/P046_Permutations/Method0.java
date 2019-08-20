package Problems.P046_Permutations;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/20,16:14
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
////交换法，主要学习该种方法
public class Method0 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permuteR(nums,0,res);
        for(int i = 0; i < res.size();i++){
            for(int j = 0; j< res.get(i).size();j++)
                System.out.print(res.get(i).get(j)+"\t");
            System.out.println();
        }
        return res;
    }
    public void permuteR(int[] nums,int index,List<List<Integer>> res)  {
        if(index == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int i:nums)
                temp.add(i);
            res.add(temp);
            return ;
        }
        for(int i = index; i < nums.length;i++){
            swap(nums,index,i);
            permuteR(nums,index+1,res);
            swap(nums,index,i);
        }
    }
    public void swap(int [] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
