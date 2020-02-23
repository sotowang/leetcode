package 动态规划.买卖股票.t123;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/14 21:38
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        //dp[i][j][k] = i天  j：交易次数    k：0未买入 1：买入
        int[][][] dp = new int[prices.length + 1][3][2];
        //初始化
        //第0天持股
        dp[0][0][1] = -prices[0];
        //第0天卖出
        dp[0][1][0] = -10086;
        dp[0][2][0] = -10086;
        //第0天不存在交易过1次
        dp[0][1][1] = -10086;

        for (int i = 1; i < prices.length; i++) {
            //未持股，未卖出股票，收益为0
            dp[i][0][0] = 0;
            //未持股，卖出过1次股票：可能今天卖出，也可能之前卖出
            dp[i][1][0] = Math.max(dp[i - 1][0][1] + prices[i], dp[i - 1][1][0]);
            //未持股，卖出过2次股票：可能今天卖出，也可能之前卖出
            dp[i][2][0] = Math.max(dp[i - 1][1][1] + prices[i], dp[i - 1][2][0]);
            //持股，未卖出股票:前一天持股，也可能今天买入
            dp[i][0][1] = Math.max(dp[i - 1][0][1], dp[i - 1][0][0] - prices[i]);
            //持股，卖出1次股票：以前卖出过1次且持股，也可能以前卖出1次且不持股+今天买入
            dp[i][1][1] = Math.max(dp[i - 1][1][1], dp[i - 1][1][0] - prices[i]);
            //持股，卖出2次股票：情况不存在
            dp[i][2][1] = -10086;
        }
        return Math.max(Math.max(dp[prices.length - 1][1][0], dp[prices.length - 1][2][0]), 0);
    }

    public static void main(String[] args) {
        assert new MaxProfit().maxProfit(new int[]{}) == 0;
        assert new MaxProfit().maxProfit(new int[]{7, 6, 4, 3, 1}) == 0;
        assert new MaxProfit().maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}) == 6;
        assert new MaxProfit().maxProfit(new int[]{1, 2, 3, 4, 5}) == 4;

    }
}
