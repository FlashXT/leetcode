package Problems.P049_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/25 9:48;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method2 {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> res = new HashMap<>();
        for(int i =0 ;i < strs.length;i++){
            char [] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            if(res.containsKey(key)){
                res.get(key).add(strs[i]);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                res.put(key,temp);
            }
        }
        return new ArrayList<>(res.values());
    }
}
