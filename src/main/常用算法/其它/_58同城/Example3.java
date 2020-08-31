package 常用算法.其它._58同城;

/**
 * @author: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {

    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int len = s.length();
        int[] dp = new int[len + 1];
        dp[len] = 1;
        if (s.charAt(len - 1) == '0') {
            dp[len - 1] = 0;
        } else {
            dp[len - 1] = 1;
        }
        for (int i = len - 2; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                dp[i] = 0;
                continue;
            }
            if ((s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0') <= 25) {
                dp[i] = dp[i + 1] + dp[i + 2];
            } else {
                dp[i] = dp[i + 1];
            }
        }
        return dp[0];
}
    public int translateNum (int num) {
        // write code here
        return numDecodings(String.valueOf(num));
    }

    public static void main(String[] args) {
        System.out.println(new Example3().translateNum(12158));
    }


}
