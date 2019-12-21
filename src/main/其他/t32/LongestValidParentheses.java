package 其他.t32;

/**
 * @auther: sotowang
 * @date: 2019/12/21 21:43
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int[] dp = new int[s.length()];
        int max = 0;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                dp[i] = 0;
            } else if (c == ')' && s.charAt(i - 1) == '(') {
                dp[i] = dp[Math.max(i - 2, 0)] + 2;
            } else if (c == ')' && i - dp[i - 1] - 1 >= 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                dp[i] = dp[i - 1] + 2 + dp[Math.max(i - dp[i - 1] - 2, 0)];
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LongestValidParentheses().longestValidParentheses("(()())"));
        System.out.println(new LongestValidParentheses().longestValidParentheses("()(())"));
        System.out.println(new LongestValidParentheses().longestValidParentheses("())"));
        System.out.println(new LongestValidParentheses().longestValidParentheses("()"));
        System.out.println(new LongestValidParentheses().longestValidParentheses(")()())"));
        System.out.println(new LongestValidParentheses().longestValidParentheses("(()"));
    }
}
