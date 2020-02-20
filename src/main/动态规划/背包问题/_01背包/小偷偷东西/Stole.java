package 动态规划.背包问题._01背包.小偷偷东西;

/**
 * @auther: sotowang
 * @date: 2020/2/19 19:38
 */
public class Stole {
    public int stole(int[] value, int[] weight, int total) {
        //dp[i][j] ==>//前i件物品放入容量为j的背包的最大价值
        int[][] dp = new int[value.length + 1][total + 1];
        for (int i = 1; i <= value.length; i++) {
            for (int j = weight[i - 1]; j <= total; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i - 1]] + value[i - 1]);
            }
        }
        return dp[value.length][total];
    }

    public static void main(String[] args) {
        int[] values = {6, 3, 5, 4, 6};
        int[] weights = {2, 2, 6, 5, 4};
        //6,3,6
        assert new Stole().stole(values, weights, 10) == 15;
    }

}
