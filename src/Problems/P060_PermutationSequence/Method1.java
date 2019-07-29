package Problems.P060_PermutationSequence;

public class Method1 {
    public String getPermutation(int n, int k) {
        String res = getPermutation("",0,n,k);
        System.out.println(res);
        return res;
    }
    private String getPermutation(String res,int index,int n, int k) {
        if(index == n){
            System.out.println(res);
            k--;
            if(k == 0)
                return res;
            else
                return null;
        }
        for(int i =index;i<n;i++){
            res+=i+1;
            getPermutation(res,index+1,n,k);
            res = res.substring(0,res.length()-1);
        }
        return res;
    }
}
