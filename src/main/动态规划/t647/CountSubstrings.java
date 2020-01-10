package 动态规划.t647;

/**
 * @auther: sotowang
 * @date: 2020/01/10 11:39
 */
public class CountSubstrings {
    public int countSubstrings(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
            count++;
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                //当两个字符`s[i]`和`s[j]`相邻时，只需要这两个字符相等即可增加`count`的值；
                //当`s[i]` 和`s[j]`不相邻时，此时只需要判断`dp[i+1][j-1]`和`s[i]`,`s[j]`是否相等即可得出结论
                if ((s.charAt(i) == s.charAt(j) && i + 1 == j) || (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        assert new CountSubstrings().countSubstrings("ababa") == 9;
        assert new CountSubstrings().countSubstrings("abbca") == 6;

    }
}
