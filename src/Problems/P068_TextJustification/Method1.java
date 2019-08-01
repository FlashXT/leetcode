package Problems.P068_TextJustification;

import java.util.ArrayList;
import java.util.List;

public class Method1 {
    //Helper类用来保存分段索引以及每段的长度
    class Helper{
        int pos;
        int len;
        public Helper(int pos,int len){
            this.pos = pos;
            this.len = len;
        }
    }
    public List<String> fullJustify(String[] words, int maxWidth) {
        //结果保存在res中
        List<String> res = new ArrayList<>();
        //strlen数组统计每个单词的长度
        int [] strlen = new int[words.length];
        for(int i = 0 ; i< words.length;i++){
            strlen[i] = words[i].length();
        }
        //flag保存分段索引与以及每段的长度
        List<Helper> flag = new ArrayList<>();
        flag.add(new Helper(-1,0));
        int temp = 0;
        for(int i =0 ; i < strlen.length;i++ ){
            //加1表示每个单词后面至少有1个空格
            temp += strlen[i]+1;
            if(temp >= maxWidth){
                //temp-1 表示 最后一个单词去掉补的空格是否 大于maxWidth
                if(temp-1 > maxWidth)
                    //如果大于，则当前分段删除最后一个单词，同时计算当前分段的长度
                    //-2,表示减去当前单词后补的空格和此分段最后一个单词的空格
                    flag.add(new Helper(i-1,temp-strlen[i--]-2));
                else
                    //如果小于等于，则除去最后一个单词的补的空格，后保存当前分度
                    flag.add(new Helper(i,temp-1));
                //temp置0，计算下一分段
                temp = 0;
            }

        }
        //最后一段单独处理
        if(temp!=0) flag.add(new Helper(strlen.length-1,temp));
        //按照分段逐个处理
        for(int i = 1; i<flag.size();i++){
            //计算当前分段的起始和终止索引
            int begin = flag.get(i-1).pos+1;
            int end = flag.get(i).pos;
            //计算当前分段的间隔数量
            int nums = end - begin;
            //计算需要添加的空格数量
            int len = maxWidth - (flag.get(i).len-nums);
            //如果当前分段只有一个单词，则nums 置为1
            if(nums == 0)  nums++;
            //为了保证每个单词之间都有一个空格，多余的空格平均添加到当前分段的左边
            String space = "";
            for(int m = 0; m < len/nums;m++)
                //计算单词间的最少空格数，求商操作
                space+="_";
            StringBuilder sb = new StringBuilder();
            if(i == flag.size()-1){
                for(int j = begin; j<end;j++){
                    sb.append(words[j]+"_");
                }
                //当前分段的最后一个单词单独处理
                sb.append(words[end]);
                for(int k = sb.length(); k < maxWidth;k++){
                    sb.append("_");
                }
            }
            else{

                for(int j = begin; j< end;j++){

                    sb.append(words[j]+space);
                    //多余的空格从左边均匀添加（关键），利用求余操作
                    if(len%nums>0 && j-begin < len%nums){
                        sb.append("_");
                    }
                }
                //当前分段的最后一个单词单独处理
                sb.append(words[end]);
                for(int k = sb.length(); k<maxWidth;k++){
                    sb.append("_");
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
