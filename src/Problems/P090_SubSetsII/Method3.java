package Problems.P090_SubSetsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/21,17:19
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method3 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        res.add(temp);
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;i++){
            int dupcount = 0;
            while((i + 1) < nums.length && nums[i+1] == nums[i]){
                dupcount++;
                i++;
            }
            int preNum = res.size();
            for(int j = 0; j< preNum;j++){
                List<Integer> temp2 = new ArrayList<>(res.get(j));
                for(int t = 0; t <= dupcount;t++){
                    temp2.add(nums[i]);
                    res.add(new ArrayList<>(temp2));
                }
            }
            for(int k = 0; k < res.size();k++)
                System.out.print(res.get(k)+"\t");
            System.out.println();
        }
        return res;
    }
}
