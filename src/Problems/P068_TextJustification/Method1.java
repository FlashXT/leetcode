package Problems.P068_TextJustification;

import java.util.ArrayList;
import java.util.List;
class Helper{
    int pos;
    int len;
    public Helper(int pos,int len){
        this.pos = pos;
        this.len = len;
    }
}
public class Method1 {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> res = new ArrayList<>();
        int [] strlen = new int[words.length];
        for(int i = 0 ; i< words.length;i++){
            strlen[i] = words[i].length();
        }
        List<Helper> flag = new ArrayList<>();
        flag.add(new Helper(-1,0));
        int temp = 0;
        for(int i =0 ; i < strlen.length;i++ ){
            temp += strlen[i]+1;
            if(temp >= maxWidth){
                if(temp-1 > maxWidth)
                   flag.add(new Helper(i-1,temp-strlen[i--]-2));
                else
                    flag.add(new Helper(i,temp-1));
                temp = 0;
            }

        }
        if(temp!=0) flag.add(new Helper(strlen.length-1,temp));
        for(int i = 1; i<flag.size();i++){
            int nums = flag.get(i).pos - flag.get(i-1).pos-1;
            int len = maxWidth - (flag.get(i).len-nums);
            if(nums == 0)
                nums++;
            int num = (int)Math.ceil(len*1.0 /nums);
            StringBuilder sb = new StringBuilder();
            if(i == flag.size()-1){
                for(int j = flag.get(i-1).pos+1; j<=flag.get(i).pos;j++){
                    sb.append(words[j]+" ");
                }
                for(int k = 0; k<len - nums;k++){
                    sb.append(" ");
                }
            }
            else{
                int count = 0;
                for(int j = flag.get(i-1).pos+1; j<=flag.get(i).pos;j++){

                    sb.append(words[j]);
                    for(int k = 0; k<num;k++){
                        if(count == len) break;
                        sb.append(" ");
                        count++;

                    }
                }
            }
            res.add(sb.toString());
        }
        for(int i = 0; i<res.size();i++){
            System.out.println(res.get(i));
        }
        return res;
    }
}
