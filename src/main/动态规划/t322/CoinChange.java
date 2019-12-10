package 动态规划.t322;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/12/09 22:20
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) {
            return 0;
        }
        //表示该金额所需要的硬币最少数
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin < 0) {
                    continue;
                }
                //此时金额与硬币面值相等,只要一个就可以了
                if (i - coin == 0) {
                    dp[coin] = 1;
                    continue;
                }
                if (dp[i] == -1 && dp[i - coin] != -1) {
                    dp[i] = dp[i - coin] + 1;
                } else if (dp[i - coin] != -1) {
                    dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                }
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins2 = {2};
        System.out.println(new CoinChange().coinChange(coins2, 4));
        int[] coins1 = {2};
        System.out.println(new CoinChange().coinChange(coins1, 3));
        int[] coins = {1, 2, 5};
        System.out.println(new CoinChange().coinChange(coins, 11));
    }
}
