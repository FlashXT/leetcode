package Problems.P060_PermutationSequence;

import java.util.LinkedList;
import java.util.List;


//因为本题是有序的全排列，可以直接计算出来第k个全排列
public class Method3 {

    public String getPermutation(int n, int k) {
        List<Integer> nums = new LinkedList<>();
        for(int i = 1; i <= n; i++)
            nums.add(i);
        String res = "";
        int pos = -1;
        while(n >= 1){
            int count = Factorial(n-1);
            pos = k /count;
            k = k%count;
            //余数为0时特殊情况，单独考虑
            if(k==0){
                res+=nums.get(pos-1);
                nums.remove(pos-1);
                int i = nums.size()-1;
                while (i >=0 ){
                    res+=nums.get(i--);
                }
                break;
            }
            res += nums.get(pos);
            nums.remove(pos);
            n--;
        }
        System.out.println(res);
        return res;
    }
    public int Factorial(int n){
        if(n == 0)
            return 1;
        return n*Factorial(n-1);
    }

}
