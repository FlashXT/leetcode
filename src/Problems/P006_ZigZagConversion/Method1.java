package Problems.P006_ZigZagConversion;

import java.util.Arrays;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/5/30 8:14;
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
/*设置一个数组，表示对应位置的字符在第几行打印；然后遍历数据按照行数进行拼接；
 *例：convert("PAYPALISHIRING",3)
 * String:  P  A  Y  P  A  L  I  S  H  I  R  I  N  G
 * pos数组:[0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1]
 * 最后按照数组中的值进行拼接，然后输出；
 */

public class Method1 {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int [] pos = new int[s.length()];
        int m = 0,flag = 0;
        for(int i = 0; i < s.length();i++){
            if(flag == 0)
                pos[i] = m++;
            if(flag == 1)
                pos[i] = m--;
            if(m == numRows-1 || m == 0)
                flag = 1-flag;
        }
        System.out.println(Arrays.toString(pos));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<=numRows;i++){
            for(int j = 0; j < pos.length;j++){
                if(pos[j] == i)
                    sb.append(s.charAt(j));
            }

        }
        return sb.toString();

    }
}
