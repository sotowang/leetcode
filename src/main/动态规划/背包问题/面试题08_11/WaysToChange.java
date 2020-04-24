package 动态规划.背包问题.面试题08_11;

/**
 * @auther: sotowang
 * @date: 2020/4/23 14:25
 */
public class WaysToChange {
    public int waysToChange(int n) {
        int[] coins = {1,5,10,25};
        int[] dp = new int[n+1];
        dp[0] = 1;
        //因为可以不停拿coin,所以coin放在最外面
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=n;j++){
                dp[j] +=dp[j-coins[i]];
                dp[j] %= 1000000007;
            }
        }
        return dp[n];
    }
}
