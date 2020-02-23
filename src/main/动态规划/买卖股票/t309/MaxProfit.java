package 动态规划.买卖股票.t309;

/**
 * @auther: sotowang
 * @date: 2019/12/09 21:15
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int[][] dp = new int[prices.length][3];

        dp[0][0] = 0;
        //第0天持有股票
        dp[0][1] = -prices[0];
        //第0天为过渡期
        dp[0][2] = 0;
        for (int i = 1; i < prices.length; i++) {
            //第i天不持有股票
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2]);
            //第i天持有股票
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][1]);
            //第i天过渡期
            dp[i][2] = dp[i - 1][1] + prices[i];
        }
        return Math.max(dp[prices.length - 1][0], dp[prices.length - 1][2]);
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 0, 2};
        System.out.println(new MaxProfit().maxProfit(prices));
    }
}
