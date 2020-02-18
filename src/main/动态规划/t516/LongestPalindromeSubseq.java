package 动态规划.t516;

/**
 * @auther: sotowang
 * @date: 2020/2/18 19:32
 */
public class LongestPalindromeSubseq {
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = 1;
        }
        for (int i = s.length() - 2; i >= 0; i--) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }

        }
        return dp[0][s.length() - 1];
    }

    public static void main(String[] args) {
        assert new LongestPalindromeSubseq().longestPalindromeSubseq("cbbd") == 2;
        assert new LongestPalindromeSubseq().longestPalindromeSubseq("bbbab") == 4;
    }
}
