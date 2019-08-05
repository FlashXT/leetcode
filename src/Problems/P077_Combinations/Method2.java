package Problems.P077_Combinations;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//递归回溯法: C ( n, k ) = C ( n - 1, k - 1) + C ( n - 1, k )
//从 n 个数字选 k 个，我们把所有结果分为两种，包含第 n 个数和不包含第 n 个数。
// 这样的话，就可以把问题转换成：
// ① 从 n - 1 里边选 k - 1 个，然后每个结果加上 n。
// ② 从 n - 1 个里边直接选 k 个。
public class Method2 {
    public List<List<Integer>> combine(int n, int k) {
        if(k == n || k == 0){
            List<Integer> row = new ArrayList<>();
            for(int i = 1 ; i <=k;i++){
                row.add(i);
            }
            return new ArrayList<>(Arrays.asList(row));
        }
        //①从 n - 1 里边选 k - 1 个，然后每个结果加上 n。
        List<List<Integer>> result = combine(n-1,k-1);
        result.forEach(e -> e.add(n));
        //②从 n - 1 个里边直接选 k 个。
        result.addAll(combine(n-1,k));

        return result;
    }
}
