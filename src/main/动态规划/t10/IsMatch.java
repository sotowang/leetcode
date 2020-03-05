package 动态规划.t10;

/**
 * @auther: sotowang
 * @date: 2019/12/25 09:49
 */
public class IsMatch {
    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        boolean[][] dp = new boolean[sLen + 1][pLen + 1];
        dp[0][0] = true;
        for (int i = 1; i <= pLen; i++) {
            if (p.charAt(i - 1) == '*' && dp[0][i - 2]) {
                dp[0][i] = true;
            }
        }
        dp[0][0] = true;
        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= pLen; j++) {
                char c1 = s.charAt(i - 1);
                char c2 = p.charAt(j - 1);
                if (c1 == c2 || c2 == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (c2 == '*') {
                    if (p.charAt(j - 2) == c1 || p.charAt(j - 2) == '.') {
                        dp[i][j] = dp[i][j - 1] || dp[i - 1][j] || dp[i][j - 2];
                    } else {
                        dp[i][j] = dp[i][j - 2];
                    }
                }
            }
        }
        return dp[sLen][pLen];
    }

    public static void main(String[] args) {
        assert new IsMatch().isMatch("aab", "c*a*b") == true;
        assert new IsMatch().isMatch("aa", "a*") == true;
        assert new IsMatch().isMatch("ab", ".*") == true;
        assert new IsMatch().isMatch("mississippi", "mis*is*p*.") == false;



    }
}
