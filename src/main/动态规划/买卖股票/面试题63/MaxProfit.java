package 动态规划.买卖股票.面试题63;

/**
 * @auther: sotowang
 * @date: 2020/2/23 18:02
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int[][] dp = new int[prices.length][2];
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            //第i天未持有股票：1.当天卖出  2.前一天未持有
            dp[i][0] = Math.max(dp[i - 1][1] + prices[i], dp[i - 1][0]);
            //第i天持有股票：1.当天买入 2.前一天持有
            dp[i][1] = Math.max( - prices[i], dp[i - 1][1]);
        }
        return dp[prices.length - 1][0];
    }

    public static void main(String[] args) {
        assert new MaxProfit().maxProfit(new int[]{7, 1, 5, 3, 6, 4}) == 5;
        assert new MaxProfit().maxProfit(new int[]{7, 6, 4, 3, 1}) == 0;

    }
}
