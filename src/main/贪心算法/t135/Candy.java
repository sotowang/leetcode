package 贪心算法.t135;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/2/26 15:48
 */
public class Candy {
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }
        int[] dp = new int[ratings.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1] && dp[i] <= dp[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && dp[i] <= dp[i + 1]) {
                dp[i] = dp[i + 1] + 1;
            }
        }
        return Arrays.stream(dp).sum();
    }

    public static void main(String[] args) {
        assert new Candy().candy(new int[]{1,0,2,1,0,2}) == 11;
        assert new Candy().candy(new int[]{1, 2, 2}) == 4;
        assert new Candy().candy(new int[]{1, 0, 2}) == 5;
    }
}
