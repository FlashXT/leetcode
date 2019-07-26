package Problems.P056_MergeIntervals;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/26 11:02;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//使用图结构，连通子图：https://leetcode.wang/leetCode-56-Merge-Intervals.html
//运行超时
public class Method3 {
    class Interval{
        int start;
        int end;
        public Interval(int [] inter){
            this.start = inter[0];
            this.end = inter[1];
        }
    }
    private  List<Interval> nodes = new ArrayList<>();
    private Map<Interval, List<Interval>> graph = new HashMap<>();
    private Map<Integer, List<Interval>> subgraph = new HashMap<>();
    Set<Interval> visited = new HashSet<>();
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1) return intervals;
        bulidGraph(intervals);
        bulidSubGraph();
        int [][] res = mergesubGraph();
        for(int i =0 ;i < res.length;i++){
            System.out.println(res[i][0]+","+res[i][1]);
        }
        return res;
    }

    //用邻接表构建graph
    public void bulidGraph(int [][] intervals){
        for(int i = 0; i < intervals.length;i++){
            Interval node = new Interval(intervals[i]);
            nodes.add(node);
            graph.put(node,new ArrayList<>());
        }
        for( Interval node1 : graph.keySet()){
            for( Interval node2 :graph.keySet()){
                if(node1!=node2 && isoverlap(node1,node2)){
                    graph.get(node1).add(node2);

                }
            }
        }
    }
    //构建各个连通子图
    public void bulidSubGraph(){
        int compent = 0;
        for(Interval node: nodes){
            if(!visited.contains(node)){
                DFS(node,compent);
                compent++;
            }
        }
    }
    //深度优先遍历子图
    public void DFS(Interval start, int compent){
        Stack<Interval> stack = new Stack<>();
        stack.add(start);
        while(!stack.isEmpty()){
            Interval node = stack.pop();
            if(!visited.contains(node)){
                visited.add(node);
                List<Interval> temp = subgraph.get(compent);
                if(temp==null){
                    temp = new ArrayList<Interval>();
                    temp.add(node);
                    subgraph.put(compent,temp);
                }
                else{
                    temp.add(node);
                }
                for(Interval next:graph.get(node)){
                    if(!visited.contains(next)){
                        stack.push(next);
                    }
                }
            }

        }

    }
    //合并连通子图
    public int [][] mergesubGraph(){
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < subgraph.size();i++){
            List<Integer> temp = new ArrayList<>();
            int start = Integer.MAX_VALUE;
            int end = Integer.MIN_VALUE;
            for( Interval node : subgraph.get(i)){
                start = start < node.start ? start:node.start;
                end = end > node.end?end:node.end;
            }
            temp.add(start);
            temp.add(end);
            res.add(temp);
        }
        int [][] ans = new int[res.size()][2];
        for(int i = 0; i < res.size();i++){
            ans[i][0] = res.get(i).get(0);
            ans[i][1] = res.get(i).get(1);
        }
        return ans;
    }
    public boolean isoverlap(Interval node1,Interval node2){
        boolean a = node1.start <= node2.end && node2.start <= node1.end;

        return a;

    }





}
