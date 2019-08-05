package Problems.P077_Combinations;


import java.util.ArrayList;
import java.util.List;

//递归回溯法优化
public class Method3 {
    private  List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
       combineR(n,k,0,new ArrayList<>());
       for(int i = 0; i < res.size();i++){
           for(int j = 0; j < res.get(i).size();j++){
               System.out.print(res.get(i).get(j)+"\t");
           }
           System.out.println();
       }
       return res;
    }
    public void combineR(int n,int k,int index,List<Integer> list){
        if(list.size() == k){
            res.add(new ArrayList<>(list));
            return ;
        }
        //for 循环里 i 从 start 到 n，其实没必要到 n。比如，n = 5，k = 4，
        // temp.size( ) == 1，此时代表我们还需要（4 - 1 = 3）个数字，
        // 如果 i = 4 的话，以后最多把 4 和 5 加入到 temp 中，而此时
        // temp.size() 才等于 1 + 2 = 3，不够 4 个，所以 i 没必要等于 4，
        // i 循环到 3 就足够了。所以 for 循环的结束条件可以改成，
        // i <= n - ( k - temp.size ( ) ) + 1，k - temp.size ( ) 代表
        // 我们还需要的数字个数。因为我们最后取到了 n，所以还要加 1。
        for(int i = index+1 ; i <= n-(k-list.size())+1;i++){
            list.add(i);
            combineR(n,k,i,list);
            list.remove(list.size()-1);
        }
    }
}
