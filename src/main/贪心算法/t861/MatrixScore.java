package 贪心算法.t861;

/**
 * @author: sotowang
 * @date: 2020/12/07 15:39
 */
public class MatrixScore {
    public int matrixScore(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        for(int i=0;i<rows;i++){
            if(A[i][0] == 0){
                for(int j=0;j<cols;j++){
                    A[i][j] ^= 1;
                }
            }
        }
        int res = 0;
        for(int i=0;i<cols;i++){
            //统计每一列有多少个1
            int count = 0;
            for(int j=0;j<rows;j++){
                count += A[j][i];
            }
            res += Math.max(rows-count,count)*(1<<cols-i-1);
        }
        return res;
    }
}
