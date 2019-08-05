package Problems.P077_Combinations;


import java.util.ArrayList;
import java.util.List;
//递归回溯法
public class Method1 {
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
        for(int i = index+1 ; i <= n;i++){
            list.add(i);
            combineR(n,k,i,list);
            list.remove(list.size()-1);
        }
    }
}
