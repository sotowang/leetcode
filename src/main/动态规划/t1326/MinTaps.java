package 动态规划.t1326;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/1/22 23:21
 */
public class MinTaps {
    public int minTaps(int n, int[] ranges) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < ranges.length; i++) {
            int left = Math.max(i - ranges[i], 0);
            int right = Math.min(i + ranges[i], n);
            for (int j = left + 1; j <= right; j++) {
                if (dp[left] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[left] + 1, dp[j]);
                }
            }
        }
        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }

    public static void main(String[] args) {
        int[] ranges3 = {4, 0, 0, 0, 4, 0, 0, 0, 4};
        assert new MinTaps().minTaps(8, ranges3) == 1;
        int[] ranges2 = {4, 0, 0, 0, 0, 0, 0, 0, 4};
        assert new MinTaps().minTaps(8, ranges2) == 2;
        int[] ranges1 = {0, 0, 0, 0};
        assert new MinTaps().minTaps(3, ranges1) == -1;
        int[] ranges = {1, 2, 1, 0, 2, 1, 0, 1};
        assert new MinTaps().minTaps(8, ranges) == 3;
    }
}
