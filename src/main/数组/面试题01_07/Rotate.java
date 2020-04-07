package 数组.面试题01_07;

/**
 * @auther: sotowang
 * @date: 2020/4/7 14:30
 */
public class Rotate {
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix[0] == null) return;
        int len = matrix.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int tem = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tem;
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len/2;j++){
                int tem = matrix[i][j];
                matrix[i][j] = matrix[i][len-1-j];
                matrix[i][len-1-j] = tem;
            }
        }

    }
}
