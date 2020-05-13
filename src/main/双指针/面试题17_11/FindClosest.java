package 双指针.面试题17_11;

/**
 * @author: sotowang
 * @date: 2020/05/13 21:03
 */
public class FindClosest {
    public int findClosest(String[] words, String word1, String word2) {
        int start = -1;
        int end = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(word1)){
                start = i;
                if(end != -1){
                    min = Math.min(Math.abs(start-end),min);
                }
            }
            if(words[i].equals(word2)){
                end = i;
                if(start!= -1){
                    min = Math.min(Math.abs(start-end),min);
                }
            }
        }
        return min;
    }
}
