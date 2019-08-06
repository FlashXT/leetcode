package Problems.P078_SubSets;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/6 11:25;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method3 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i< Math.pow(2,nums.length);i++){
            List<Integer> res_temp = new ArrayList<>();
            int temp = i;
            for(int k = 0; temp >0;k++){

                if((temp & 1)%2 == 1){
                    res_temp.add(nums[nums.length-1-k]);
                }
                temp = temp>>1;

            }
            ans.add(res_temp);
        }
        for(int i = 0; i< ans.size();i++){
            for(int j = 0;j < ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j)+"\t");
            }
            System.out.println();
        }
        return ans;
    }
}
