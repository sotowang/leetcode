package 常用算法.其它;


import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/3/29 19:40
 */
public class Example5 {
    public static int solution(String str, String pattern) {
        if (str.isEmpty() || pattern.isEmpty()) {
            return 0;
        }
        int count = 0;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = start; j < i; j++) {
                String tem = str.substring(j, i);
                if (isMatch(tem, pattern)) {
                    count++;
                    j=i;
                    start = i;
                }
            }

        }
        return count;
    }
    public static boolean isMatch(String s, String p) {
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
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String pattern = sc.next();
        //Abcd123BcdB76 A*1
        //AAA333 A*3
        System.out.println(solution(str, pattern));
        System.out.println(1);

    }
}
