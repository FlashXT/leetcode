package Problems.P057_InsertInterval;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/26 14:56;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int [] [] inters = new int[intervals.length+1][2];
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        //将newInterval插入intervals中
        insert(inters,intervals,newInterval);
        temp.add(inters[0][0]);
        temp.add(inters[0][1]);
        res.add(temp);
        //逐个比较插入
        for(int i = 1; i < inters.length;i++){
            if(inters[i][0] > res.get(res.size()-1).get(1)){
                temp = new ArrayList<>();
                temp.add(inters[i][0]);
                temp.add(inters[i][1]);
                res.add(temp);
            }
            else{
                temp = res.get(res.size()-1);
                temp.set(1,Math.max(temp.get(1),inters[i][1]));
                res.set(res.size()-1,temp);
            }

        }

        int [] [] ans = new int [res.size()][2];
        for(int i = 0; i < res.size();i++){
            ans[i][0] = res.get(i).get(0);
            ans[i][1] = res.get(i).get(1);
        }
        for(int i = 0; i < res.size();i++){
           System.out.println(ans[i][0]+","+ans[i][1]);

        }
        return ans;
    }
    private void insert(int [] [] inters,int[][] intervals, int[] newInterval){
        boolean isinserted = false;
           for(int i = 0; i<inters.length-1;i++){
               if(!isinserted&&newInterval[0]< intervals[i][0]){
                   inters[i][0] = newInterval[0];
                   inters[i][1] = newInterval[1];
                   isinserted = true;
               }
               else{
                   int index = i;
                   if(isinserted){
                       index = i-1;
                   }
                   inters[i][0] = intervals[index][0];
                   inters[i][1] = intervals[index][1];
               }
           }
           if(!isinserted){
               inters[inters.length-1][0] = newInterval[0];
               inters[inters.length-1][1] = newInterval[1];
           }
           else{
               inters[inters.length-1][0] = intervals[intervals.length-1][0];
               inters[inters.length-1][1] = intervals[intervals.length-1][1];
           }


    }
}
