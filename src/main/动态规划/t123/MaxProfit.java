package 动态规划.t123;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/14 21:38
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int n = prices.length;
        //第i天持有状态，交易笔数
        int[][][] dp = new int[n][2][2];
        dp[0][0][0] = 0;
        dp[0][1][0] = -prices[0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < dp[0][0].length; j++) {
                dp[i][0][j] = Math.max();
                dp[i][1][j] = Math.max();
            }
        }
        return 0;
    }
}
