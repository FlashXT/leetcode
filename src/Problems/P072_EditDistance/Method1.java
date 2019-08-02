package Problems.P072_EditDistance;

public class Method1 {
    public int minDistance(String word1, String word2) {
        if(word1.length() == 0 && word2.length() ==0)
            return 0;
        if(word1.length() == 0 || word2.length() == 0)
            return word1.length()==0? word2.length():word1.length();
        int d1 = minDistance(word1,word2.substring(0,word2.length()-1))+1;
        int d2 = minDistance(word1.substring(0,word1.length()-1),word2)+1;
        int d3 = minDistance(word1.substring(0,word1.length()-1),word2.substring(0,word2.length()-1));
        if(word1.charAt(word1.length()-1) != word2.charAt(word2.length()-1))
            d3++;

        return Math.min(Math.min(d1,d2),d3);
    }
}
