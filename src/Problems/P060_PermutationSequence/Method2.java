package Problems.P060_PermutationSequence;
//LeetCode_Day004,2019.6.3,Monday;FlashXT!
public class Method2 {
    int count = -1;
    private String result = "";
    public String getPermutation(int n, int k) {
        int [] visited = new int [n+1];
        for(int i = 1; i <visited.length;i++)
            visited[i] = 1;
        count = k;
        getPermutation("",visited,0,n);
        System.out.println(result);
        return result;
    }
    private boolean getPermutation(String res,int[] visited,int index,int n) {
        if(index == n){
            System.out.println(res);
            count--;
            if(count == 0){
                result = res;
                return true;
            }
            return false;
        }
        for(int i =1;i<=n;i++){
            if(visited[i]!= 0){
                res+=i;
                visited[i] --;
                if(!getPermutation(res,visited,index+1,n)){
                    res = res.substring(0,res.length()-1);
                    visited[i] ++;
                }

            }

        }
        return false;
    }
}
