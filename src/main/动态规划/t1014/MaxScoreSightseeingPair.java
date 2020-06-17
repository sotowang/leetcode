package 动态规划.t1014;

/**
 * @author: wangsongtao
 * @date: 2020/06/17 22:39
 */
public class MaxScoreSightseeingPair {
    public int maxScoreSightseeingPair(int[] A) {
        int res = 0;
        int max = A[0];
        for(int j=1;j<A.length;j++){
            res = Math.max(res,max+A[j]-j);
            max = Math.max(max,A[j]+j);
        }
        return res;
    }
}
