package 动态规划.背包问题.t322;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/12/09 22:20
 */
public class CoinChange {
    public int coinChange1(int[] coins, int amount) {
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
    public int coinChange(int[] coins, int amount) {
        if (coins.length == 0) {
            return -1;
        }
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin :
                    coins) {
                if (i - coin < 0) {
                    continue;
                }
                if (i == coin) {
                    dp[i] = 1;
                    continue;
                }
                if (dp[i] != -1 && dp[i - coin] != -1) {
                    //当取该coin时，看i-coin是否存在，若存在，则取之加1，1代表该coin
                    dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                } else if (dp[i - coin] != -1) {
                    dp[i] = dp[i - coin] + 1;
                }
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins3 = {1};
        assert new CoinChange().coinChange(coins3, 0) == 0;
        int[] coins2 = {2};
        assert new CoinChange().coinChange(coins2, 4) == 2;
        System.out.println();
        int[] coins1 = {2};
        assert new CoinChange().coinChange(coins1, 3) == -1;
        int[] coins = {1, 2, 5};
        assert new CoinChange().coinChange(coins, 11) == 3;

    }
}
