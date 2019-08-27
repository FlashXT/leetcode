package Problems.P097_InterleavingString;

import java.util.LinkedList;
import java.util.Queue;

/*****************************************************************
 * @Author:FlashXT;
 * @Date: 2019/8/27 11:30
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//广度优先遍历
class Point{
    int x;
    int y;
    Point(int x,int y){
        this.x = x;
        this.y =y;
    }
}
public class Method4 {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())
            return false;
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0,0));
        boolean [][] visited = new boolean[s1.length()+1][s2.length()+1];
        while(!queue.isEmpty()){
            Point cur = queue.poll();
            if(cur.x == s1.length() && cur.y == s2.length())
                return true;
            //尝试向右走
            int right = cur.x+1;
            if(right <= s1.length() && s1.charAt(right-1) == s3.charAt(right+cur.y-1)){
                if(!visited[right][cur.y]){
                    visited[right][cur.y] = true;
                    queue.offer(new Point(right,cur.y));
                }

            }
            //尝试向下走
            int down = cur.y+1;
            if(down <= s2.length() && s2.charAt(down-1) == s3.charAt(down+cur.x-1)){
                if(!visited[cur.x][down]){
                    visited[cur.x][down] = true;
                    queue.offer(new Point(cur.x,down));
                }

            }
        }
        return false;
    }
}
