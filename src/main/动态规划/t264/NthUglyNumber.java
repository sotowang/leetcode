package 动态规划.t264;

/**
 * @auther: sotowang
 * @date: 2019/12/16 17:47
 */
public class NthUglyNumber {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(Math.min(dp[index2] * 2, dp[index3] * 3), dp[index5] * 5);
            if (dp[index2] * 2 <= dp[i]) {
                index2++;
            }
            if (dp[index3] * 3 <= dp[i]) {
                index3++;
            }
            if (dp[index5] * 5 <= dp[i]) {
                index5++;
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(new NthUglyNumber().nthUglyNumber(10));
    }
}
