package 贪心算法.t44;

/**
 * @auther: sotowang
 * @date: 2019/11/15 20:20
 */
public class IsMatch {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        //`f[i][j]`表示`s1`的前i个字符，和`p`的前j个字符，能否匹配
        boolean[][] f = new boolean[m + 1][n + 1];
        f[0][0] = true;
        for (int i = 1; i <= n; i++) {
            //如果p为*且前一个为状态true,则匹配
            f[0][i] = f[0][i - 1] && p.charAt(i - 1) == '*';
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                //如果s1的第 i 个字符和p的第 j 个字符相同，或者p的第 j 个字符为 “?”
                if (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') {
                    f[i][j] = f[i - 1][j - 1];
                }
                //如果p的第 j 个字符为 *
                //若p的第 j 个字符匹配空串, f[i][j] = f[i][j - 1]
                //若p的第 j 个字符匹配s1的第 i 个字符, f[i][j] = f[i - 1][j]
                if (p.charAt(j-1) == '*') {
                    //这里注意不是 f[i - 1][j - 1]， 举个例子就明白了 (abc, a*) f[3][2] = f[2][2]
                    f[i][j] = f[i - 1][j] || f[i][j - 1];
                }

            }
        }
        return f[m][n];
    }

    public static void main(String[] args) {
        System.out.println(new IsMatch().isMatch("adceb", "*a*b"));
        System.out.println(new IsMatch().isMatch("ab", "?*"));
    }
}
