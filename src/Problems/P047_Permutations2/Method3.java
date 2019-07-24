package Problems.P047_Permutations2;

import java.util.*;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/24 14:29;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//递归回溯法HashMap字符计数，与排序解耦
public class Method3 {
    public List<List<Integer>> permuteUnique(int[] nums) {
     Map<Integer,Integer> map= new HashMap<Integer, Integer>();
     for(int i :nums){
         map.put(i,map.getOrDefault(i,0)+1);
     }
     int []digits = new int[map.size()];
     int [] count = new int[map.size()];
     int i = 0;
     for(Map.Entry<Integer,Integer> entry:map.entrySet()){
         digits[i] = entry.getKey();
         count[i++]=entry.getValue();
     }
     List<List<Integer>> res = new ArrayList<>();
     permute(digits,count,new int[nums.length],0,res);
     return res;


    }
    public void permute(int [] digit,int [] count,int []temp,int level,List<List<Integer>> res){
        if(level == temp.length){
            List<Integer> list = new ArrayList<>();
            for(int i:temp)
                list.add(i);
            res.add(list);
            return ;
        }

        for(int i = 0; i < count.length;i++){
            if(count[i]!=0){
                temp[level] =digit[i];
                count[i]--;
                permute(digit,count,temp,level+1,res);
                count[i]++;
            }
        }

    }


}
