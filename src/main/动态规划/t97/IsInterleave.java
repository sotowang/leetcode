package 动态规划.t97;

/**
 * @auther: sotowang
 * @date: 2020/01/02 19:27
 */
public class IsInterleave {
    public boolean isInterleave1(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        String[][] dp = new String[s1.length() + 1][s2.length() + 1];
        dp[0][0] = "";
        for (int i = 1; i < dp.length; i++) {
            if (s1.substring(0, i).equals(s3.substring(0, i))) {
                dp[i][0] = s3.substring(0, i);
            } else {
                dp[i][0] = "";
            }
        }
        for (int i = 1; i < dp[0].length; i++) {
            if (s2.substring(0, i).equals(s3.substring(0, i))) {
                dp[0][i] = s3.substring(0, i);
            } else {
                dp[0][i] = "";
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (!dp[i][j + 1].equals("") && (dp[i][j + 1] + s1.charAt(i)).equals(s3.substring(0, i + j + 2))) {
                    dp[i + 1][j + 1] = s3.substring(0, i + j + 2);
                } else if (!dp[i + 1][j].equals("") && (dp[i + 1][j] + s2.charAt(j)).equals(s3.substring(0, i + j + 2))) {
                    dp[i + 1][j + 1] = s3.substring(0, i + j + 2);
                } else {
                    dp[i + 1][j + 1] = "";
                }
            }
        }
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                System.out.print(dp[i][j] + ", ");
            }
            System.out.println();
        }
        return dp[s1.length()][s2.length()].equals(s3);
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }
        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;
        for (int i = 1; i < dp.length; i++) {
            if (s1.substring(0, i).equals(s3.substring(0, i))) {
                dp[i][0] = true;
            }
        }
        for (int i = 1; i < dp[0].length; i++) {
            if (s2.substring(0, i).equals(s3.substring(0, i))) {
                dp[0][i] = true;
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if ((dp[i][j + 1] && s1.charAt(i) == s3.charAt( i + j + 1)) || (dp[i + 1][j] && s2.charAt(j) == s3.charAt(i + j + 1)) ) {
                    dp[i + 1][j + 1] = true;
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }


    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = "adbcef";
        assert new IsInterleave().isInterleave(s1, s2, s3) == true;
        System.out.println();
        String s4 = "aabcc";
        String s5 = "dbbca";
        String s6 = "aadbbbaccc";
        assert new IsInterleave().isInterleave(s4, s5, s6) == false;
    }

}
