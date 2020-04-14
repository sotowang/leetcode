package 数学.t598;

/**
 * @auther: sotowang
 * @date: 2020/4/14 18:34
 */
public class MaxCount {
    public int maxCount(int m, int n, int[][] ops) {
        int rows = ops.length;
        int minA = m;
        int minB = n;
        for(int i=0;i<rows;i++){
            minA = minA>ops[i][0]?ops[i][0]:minA;
            minB = minB>ops[i][1]?ops[i][1]:minB;
        }
        return minA*minB;
    }
}
