package 动态规划.t714;

/**
 * @author: sotowang
 * @date: 2020/12/17 21:42
 */
public class MaxProfit {
    public int maxProfit(int[] prices, int fee) {
        //dp[0]不持股  dp[1]持股
        int[] dp = new int[2];
        dp[1] = -prices[0];
        for(int i=2;i<=prices.length;i++){
            //不持股：1 当天不持股 2.前天买股，当天卖出
            dp[0] = Math.max(dp[0],dp[1]+prices[i-1]-fee);
            //持股：1.当天持股 2.前天不持股当天买股
            dp[1] = Math.max(dp[1],dp[0]-prices[i-1]);
        }
        //返回不持股状态
        return dp[0];
    }
}
