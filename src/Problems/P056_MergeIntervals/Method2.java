package Problems.P056_MergeIntervals;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/26 8:16;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//先排序将问题简化：https://leetcode.wang/leetCode-56-Merge-Intervals.html
public class Method2 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1) return intervals;
        //①先对输入二维数组进行排序
        Mergesort(intervals,0,intervals.length-1);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(intervals[0][0]);
        temp.add(intervals[0][1]);
        res.add(temp);
        //②逐个比较插入
        for(int i = 1; i < intervals.length;i++){

            if(intervals[i][0] > res.get(res.size()-1).get(1)){
                temp = new ArrayList<>();
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
                res.add(temp);
            }
            else{
                temp = res.get(res.size()-1);
                temp.set(1,Math.max(temp.get(1),intervals[i][1]));
//                res.set(res.size()-1,temp);
            }
        }
        int [] [] ans = new int [res.size()][2];
        for(int i = 0; i < res.size();i++){
            ans[i][0] = res.get(i).get(0);
            ans[i][1] = res.get(i).get(1);

        }
        return ans;

    }
    private void Mergesort(int[][] intervals,int start ,int end){
        if(start == end) return;
        int mid = start + (end - start)/2;
        Mergesort(intervals,start,mid);
        Mergesort(intervals,mid+1,end);
        Merge(intervals,start,mid,end);

    }
    private void Merge(int[][] intervals,int start ,int mid ,int end){
        int [][] temp = new int [end - start+1][2];
        int p = start;
        int q = mid+1;
        int i = 0;
        while(p <=mid && q <=end){
            if(intervals[p][0] < intervals[q][0]){
                temp[i][0] = intervals[p][0];
                temp[i++][1] = intervals[p][1];
                p++;
            }
            else{
                temp[i][0] = intervals[q][0];
                temp[i++][1] = intervals[q][1];
                q++;
            }
        }
        while(p <= mid){
            temp[i][0] = intervals[p][0];
            temp[i++][1] = intervals[p][1];
            p++;
        }
        while(q <= end){
            temp[i][0] = intervals[q][0];
            temp[i++][1] = intervals[q][1];
            q++;
        }
        for(int j = 0; j < temp.length;j++){
            intervals[start+j][0] = temp[j][0];
            intervals[start+j][1] = temp[j][1];
        }

    }
}
