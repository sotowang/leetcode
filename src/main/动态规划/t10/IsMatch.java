package 动态规划.t10;

/**
 * @auther: sotowang
 * @date: 2019/12/25 09:49
 */
public class IsMatch {
    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '*' && dp[0][i - 1]) {
                dp[0][i + 1] = true;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
                    dp[i + 1][j + 1] = dp[i][j];
                } else {
                    if (p.charAt(j) == '*') {
                        if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.') {
                            dp[i + 1][j + 1] = dp[i + 1][j - 1];
                        } else {
                            dp[i + 1][j + 1] = dp[i][j + 1] || dp[i + 1][j - 1] || dp[i + 1][j];
                        }
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }

    public static void main(String[] args) {
        assert new IsMatch().isMatch("aa", "a*") == true;
        assert new IsMatch().isMatch("ab", ".*") == true;
        assert new IsMatch().isMatch("aab", "c*a*b") == true;
        assert new IsMatch().isMatch("mississippi", "mis*is*p*.") == false;

    }
}
