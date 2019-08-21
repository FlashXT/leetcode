package Problems.P089_GrayCode;

import java.util.ArrayList;
import java.util.List;

/*****************************************************************
 * @Author:FlashXT;
 * @Date:2019/8/21,11:13
 * @Version 1.0
 * CopyRight © 2018-2020,FlashXT & turboMan . All Right Reserved.
 *****************************************************************/
public class Method1 {
  public List<Integer> grayCode(int n){
      List<Integer> gray = new ArrayList<>();
      gray.add(0);
      for(int i = 0; i <n;i++){
          int add = 1<<i;
          for(int j = gray.size()-1; j >=0 ;j--){
              gray.add(gray.get(j)+add);
          }
      }
      for(int i = 0 ; i < gray.size();i++){
          System.out.println(gray.get(i));
      }
      return gray;
  }

}
