package Problems.P046_Permutations;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/24 12:27;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//回溯法
public class Method1 {
    private List<List<Integer>> res= new ArrayList<List<Integer>>();
    private int visited[];
    public List<List<Integer>> permute(int[] nums) {
        visited = new int[nums.length];
        ArrayList<Integer> temp = new ArrayList<>();
        permute(nums,temp);
        for(int i = 0; i < res.size();i++){
            for(int j = 0; j< res.get(i).size();j++)
                System.out.print(res.get(i).get(j)+"\t");
            System.out.println();
        }
        return res;
    }
    private void permute(int[] nums,ArrayList<Integer> temp) {
        if(temp.size()== nums.length){
            res.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=0;i < visited.length;i++){
            if(visited[i]==0){
                temp.add(nums[i]);
                visited[i]=1;
                permute(nums,temp);
                visited[i]=0;
                temp.remove((Integer) nums[i]);
            }
        }

    }
}
