package 动态规划.背包问题.ol背包;

/**
 * @auther: sotowang
 * @date: 2020/2/3 20:28
 */
public class Knapsack {
    private int knapsackProblem(int[] weight, int[] costs, int n,int m) {
        int[][] dp = new int[n + 1][m + 1];
        int res = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j < weight[i-1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i-1]] + costs[i-1]);
                    res = Math.max(dp[i][j], res);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] weight1 = {1, 2, 3, 4};
        int[] costs1 = {2, 4, 4, 5};
        assert new Knapsack().knapsackProblem(weight1, costs1, 4, 5) == 8;
        int[] weight = {5, 4, 7, 2, 6};
        int[] costs = {12, 3, 10, 3, 6};
        assert new Knapsack().knapsackProblem(weight, costs, 5, 15) == 25;
    }
}
