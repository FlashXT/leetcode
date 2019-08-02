package Problems.P072_EditDistance;

public class Method2 {
    public int minDistance(String word1, String word2) {

        return edit_Distance(word1,word2,word1.length()-1,word2.length()-1);
    }
    private static int edit_Distance(String word1,String word2,int w1index,int w2index){
       //Method1中使用使用word.length()表示长度,该方法w1index表示索引,所以return的条件不一样
        if (w1index < 0 && w2index <0){
            return 0;
        }
        if(w1index < 0){
            return w2index <0? 0:w2index;
        }
        if(w2index < 0){
            return w1index <0? 0:w1index;
        }

        char w1char=word1.charAt(w1index);
        char w2char=word2.charAt(w2index);
        if (w1char == w2char){
            return edit_Distance(word1,word2,w1index-1,w2index-1);
        }
        int dis1 = edit_Distance(word1,word2,w1index-1,w2index);
        int dis2 = edit_Distance(word1,word2,w1index,w2index-1);
        int dis3 = edit_Distance(word1,word2,w1index-1,w2index-1);
        return Math.min(Math.min(dis1,dis2),dis3)+1;
    }
}
