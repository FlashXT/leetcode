package Problems.P056_MergeIntervals;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/26 8:16;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//将大问题分解为小问题：https://leetcode.wang/leetCode-56-Merge-Intervals.html
public class Method1 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0) return intervals;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(intervals[0][0]);
        temp.add(intervals[0][1]);
        res.add(temp);
        //将intervals中剩下的元素逐个加入res中
        for(int i = 1; i<intervals.length;i++){
            int size = res.size();
            int start = -1;
            int end = -1;
            List<List<Integer>> rm = new ArrayList<>();
            for(int j = 0; j < size;j++){
                if(intervals[i][0] >= res.get(j).get(0) && intervals[i][0] <= res.get(j).get(1)){
                    start = j;
                }
                if(intervals[i][1] >= res.get(j).get(0) && intervals[i][1] <= res.get(j).get(1)){
                    end = j;
                }
                if(intervals[i][0] < res.get(j).get(0) && intervals[i][1] > res.get(j).get(1)){
                    rm.add(res.get(j));
                }
            }
            temp = new ArrayList<>();
            int status = status(start,end);
            switch (status){
                case 1:{
                    temp.add(res.get(start).get(0));
                    temp.add(intervals[i][1]);
                    res.add(temp);
                    rm.add(res.get(start));
                    break;
                }
                case 2:{
                    temp.add(intervals[i][0]);
                    temp.add(res.get(end).get(1));
                    res.add(temp);
                    rm.add(res.get(end));
                    break;
                }
                case 3:{
                    temp.add(res.get(start).get(0));
                    temp.add(res.get(end).get(1));
                    res.add(temp);
                    rm.add(res.get(start));
                    rm.add(res.get(end));
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    temp.add(intervals[i][0]);
                    temp.add(intervals[i][1]);
                    res.add(temp);
                    break;
                }
            }

            if(rm.size() >0){
                res.removeAll(rm);
            }

        }
        int [] [] ans = new int [res.size()][2];
        for(int i = 0; i < res.size();i++){
            ans[i][0] = res.get(i).get(0);
            ans[i][1] = res.get(i).get(1);

        }
        return ans;
    }
    public int status(int start,int end){
        if(start != -1 && end==-1)
            return 1;
        else if(start == -1 && end != -1)
            return 2;
        else if(start != -1 && end != -1){
            if(start != end)
                return 3;
            else
                return 4;
        }
        else{
            return 5;
        }
    }
}
