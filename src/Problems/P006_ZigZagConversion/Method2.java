package Problems.P006_ZigZagConversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/30 8:14;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
//桶的思想，把输出到相同行的字符放到一个桶中，最后把所有桶中的字符拼接起来；
public class Method2 {
    public String convert(String s, int numRows) {
        //特殊情况，直接输出
        if(numRows == 1) return s;
        StringBuilder[] list = new StringBuilder[numRows];
        for(int i = 0 ; i < numRows;i++)
            list[i] = new StringBuilder();

        int m = 0,flag = 0;
        for(int i = 0; i < s.length();i++){
            if(flag == 0)
                list[m++].append(s.charAt(i));
            else
                list[m--].append(s.charAt(i));
            if(m == numRows-1 || m == 0)
                flag = 1-flag;
        }
        StringBuilder st = new StringBuilder();
        for(int i = 0; i<numRows;i++){
            st.append(list[i]);
        }

        return st.toString();

    }
}
