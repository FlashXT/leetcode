package Problems.P089_GrayCode;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/21,11:13
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method2 {
  public List<Integer> grayCode(int n){
      List<Integer> gray = new ArrayList<Integer>();
      for(int binary = 0;binary < 1 << n; binary++){
          gray.add(binary ^ (binary >> 1));
      }
      return gray;
  }

}
