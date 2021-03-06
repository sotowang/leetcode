package 动态规划.t62;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class UniquePaths {
    public int uniquePaths1(int m, int n) {
        //m 列 n行
        int[][] path = new int[m][n];

        //第一行与第一列均有1条路径到达
        for (int i = 0; i < m; i++) {
            path[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            path[0][i] = 1;

        }
        //从第二行第二列开始计算
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                path[i][j] = path[i - 1][j] + path[i][j - 1];
            }
        }

        return path[m - 1][n - 1];
    }

    /**
     * 优化path数组，因只需要记录上面和左面的数，故不需要二维数组也可,优化后内存似乎并没有改变多少
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths2(int m, int n) {
        int[] path = new int[n];
        Arrays.fill(path, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                path[j] += path[j - 1];

            }
        }
        return path[n - 1];
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[n][m];
        Arrays.fill(dp[0], 1);
        for (int i = 1; i < n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[n - 1][m - 1];
    }
    public static void main(String[] args) {
        assert new UniquePaths().uniquePaths(3, 3) == 6;
        assert new UniquePaths().uniquePaths(7, 3) == 28;
        assert new UniquePaths().uniquePaths(1, 1) == 1;

    }
}
