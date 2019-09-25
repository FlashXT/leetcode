package Problems.P0110_BalancedBinaryTree;

import java.util.*;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/9/25,15:06
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Test {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int sum = 0;
        Map<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < M;i++){
            int L = scan.nextInt();
            int R = scan.nextInt();
            sum+= R-L+1;
            Set<Integer> temp = new HashSet<>();
            if(map.size()==0)
                map.put(L,R);

            else{

                for(Integer key : map.keySet()){
                    //大段
                    if(key >= L && map.get(key) <= R){
                        sum -= map.get(key)-key+1;
                        temp.add(key);
                    }
                    //子段
                    else if(key <= L && map.get(key) >= R){
                        sum-= R-L+1;
                    }
                    //跨段
                    else{
                        int flag = -1;
                        if(key < L && map.get(key)> L){
                            sum-=map.get(key)-L+1;
                            map.put(key,R);
                            flag = key;
                        }
                        if(key < R && map.get(key) > R){
                            sum-=R-key+1;
                            map.put(flag,map.get(key));
                            temp.add(key);
                        }
                    }
                }

            }

            for(Integer k : temp)
                map.remove(k);
            System.out.println(sum);
        }

    }
}