package 精选top面试题.t221;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @auther: sotowang
 * @date: 2019/12/09 20:26
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return 0;
        }
        int[][] dp = new int[matrix.length + 1][matrix[0].length + 1];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    dp[i + 1][j + 1] = Math.min(Math.min(dp[i][j], dp[i + 1][j]), dp[i][j + 1]) + 1;
                    if (dp[i + 1][j + 1] > max) {
                        max = dp[i + 1][j + 1];
                    }
                }
            }
        }
        return max * max;
    }

    public static void main(String[] args) {
        char[][] matrix = {
                {'1', '0', '1','0', '0'},
                {'1', '0', '1','1', '1'},
                {'1', '1', '1','1', '1'},
                {'1', '0', '0','1', '0'}
        };
        System.out.println(new MaximalSquare().maximalSquare(matrix));

    }

}
