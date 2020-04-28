package 数学.丑数.t313;

/**
 * @auther: sotowang
 * @date: 2020/1/26 18:53
 */
public class NthSuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] dp = new int[n];
        int[] index = new int[primes.length];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < index.length; j++) {
                dp[i] = Math.min(dp[index[j]] * primes[j], dp[i]);
            }
            for (int j = 0; j < index.length; j++) {
                if (dp[index[j]] * primes[j] <= dp[i]) {
                    dp[i] = dp[index[j]] * primes[j];
                    index[j]++;
                }
            }
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] primes = {2, 7, 13, 19};
        assert new NthSuperUglyNumber().nthSuperUglyNumber(12, primes) == 32;
    }

}
