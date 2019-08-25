package Problems.P093_RestoreIPAddresses;

import java.util.Iterator;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/25,9:57
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Main {
    public static void main(String [] args){
        String str = "010010";
        List<String> ans = new Method2().restoreIpAddresses(str);
        Iterator<String> itor = ans.iterator();
        while(itor.hasNext())
            System.out.println(itor.next());
    }
}
