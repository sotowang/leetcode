package 动态规划.t338;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/12/18 19:13
 */


public class CountBits  {
    public int[] countBits1(int num) {
        int[] dp = new int[num + 1];
        dp[0] = 0;
        for (int i = 1; i <= num; i++) {
            dp[i] = dp[i & (i - 1)] + 1;
        }
        return dp;
    }

    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            dp[i] = dp[i & (i - 1)] + 1;
        }
        return dp;
    }

    public static void main(String[] args) {
        CountBits countBits = new CountBits();
        int[] res = countBits.countBits(5);
        Arrays.stream(res).forEach(System.out::print );
        System.out.println();
        int[] res1 = countBits.countBits(2);
        Arrays.stream(res1).forEach(System.out::print );

    }
}
