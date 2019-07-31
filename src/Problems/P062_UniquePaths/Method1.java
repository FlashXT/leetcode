package Problems.P062_UniquePaths;

//递归运行超时
public class Method1 {
    private int res = 0;
    public int uniquePaths(int m, int n) {
        uniquePaths(m,n,0,0);
        return res;
    }
    private void uniquePaths(int m, int n,int posx,int posy) {
        if(posx == m-1 && posy == n-1){
            res++;
            return ;
        }
        if(posx == m || posy == n){
            return ;
        }

        uniquePaths(m,n,posx+1,posy);
        uniquePaths(m,n,posx,posy+1);
    }
}
