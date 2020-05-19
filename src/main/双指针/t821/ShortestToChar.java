package 双指针.t821;

/**
 * @author: wangsongtao
 * @date: 2020/05/19 20:12
 */
public class ShortestToChar {
    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        int leftE = len-1;
        int[] res = new int[len];
        for(int i=0;i<len;i++){
            if(S.charAt(i) == C){
                leftE = i;
            }
            res[i] = Math.abs(i-leftE);
        }
        int rightE = 0;
        for(int i=len-1;i>=0;i--){
            if(S.charAt(i) == C){
                rightE = i;
            }
            res[i] = Math.min(res[i],Math.abs(i-rightE));
        }
        return res;
    }
}
