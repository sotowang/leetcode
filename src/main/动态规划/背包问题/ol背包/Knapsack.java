package 动态规划.背包问题.ol背包;

/**
 * @auther: sotowang
 * @date: 2020/2/3 20:28
 */
public class Knapsack {
    private int knapsackProblem(int[] weight, int[] costs, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        //dp[i][j] ==>前i件物品放入容量为j的背包的最大价值
        for (int i = 1; i <= n; i++) {
            for (int j = weight[i - 1]; j <= m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i - 1]] + costs[i - 1]);
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        int[] weight2 = {2, 2, 6, 5, 4};
        int[] costs2 = {6, 3, 5, 4, 6};
        assert new Knapsack().knapsackProblem(weight2, costs2, 5, 10) == 15;
        int[] weight1 = {1, 2, 3, 4};
        int[] costs1 = {2, 4, 4, 5};
        assert new Knapsack().knapsackProblem(weight1, costs1, 4, 5) == 8;
        int[] weight = {5, 4, 7, 2, 6};
        int[] costs = {12, 3, 10, 3, 6};
        assert new Knapsack().knapsackProblem(weight, costs, 5, 15) == 25;
    }
}
