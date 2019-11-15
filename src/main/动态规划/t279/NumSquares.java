package 动态规划.t279;

/**
 * @auther: sotowang
 * @date: 2019/11/15 17:21
 */
public class NumSquares {
    public int numSquares(int n) {
        if (n == 1) {
            return n;
        }
        //状态
        int[] dp = new int[n + 1];
        for (int i = 1; i < dp.length; i++) {
            //最坏情况
            dp[i] = i;
            for (int j = 1; i - j * j >= 0; j++) {
                //状态转移议程
                dp[i] = Math.min(dp[i - j * j] + 1, dp[i]);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new NumSquares().numSquares(12));

    }
}
