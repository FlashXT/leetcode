package Problems.P049_GroupAnagrams;

import java.util.*;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/7/25 9:48;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        String [] value = new String[strs.length];
        ArrayList<String> vs = new ArrayList<>();
        for(int i = 0; i < strs.length;i++){
            char [] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            value[i] = String.valueOf(temp);
            if(!vs.contains(value[i]))
                vs.add(value[i]);

        }

        List<List<String>> res = new ArrayList<>();

        for(int i = 0 ; i < vs.size();i++){
            ArrayList<String> al = new ArrayList<>();
            for(int j =0 ; j < value.length;j++){
               if(value[j].equals(vs.get(i)))
                   al.add(strs[j]);
            }
            res.add(al);
        }
        return res;
    }
}
