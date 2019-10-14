package 动态规划.t122;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/12 22:32
 */
public class MaxProfit {
    public int maxProfit1(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profit += (prices[i ] - prices[i-1]);
            }
        }
        return profit;
    }
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        //第一维为天数，第二维为当天是否持有股票
        int[][] dp = new int[prices.length][2];
        //第0天未持有股票，则收益为0
        dp[0][0] = 0;
        //第0天持有股票，则收益为-prices[i]
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            //第i天未持有股票，则最大收益为Max(前一天未持有股票,前一天持有股票+当天股票卖出)
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            //第i天持有股票，则收益为Max(前一天持有投票，今天买入股票(-prices[i]))
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        //返回最后一天未持有股票
        return dp[prices.length - 1][0];
    }

    public static void main(String[] args) {
        System.out.println(new MaxProfit().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new MaxProfit().maxProfit(new int[]{1, 2, 3, 4, 5}));
        System.out.println(new MaxProfit().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
