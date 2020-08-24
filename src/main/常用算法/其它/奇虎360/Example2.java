package 常用算法.其它.奇虎360;

import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 {
    public static long count(int[][] matrix, int m, int n) {
        long max = 0;
        long[][] dp = new long[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (j >= 1) {
                    dp[i][j] = matrix[i - 1][j - 1] + dp[i - 1][n - j];
                } else {
                    dp[i][j] = dp[i - 1][n];
                }
                max = Math.max(dp[i][j], max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println(count(matrix,m,n));
    }


}
