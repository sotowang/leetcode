package 动态规划.t32;

/**
 * @auther: sotowang
 * @date: 2019/12/21 21:43
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int len = s.length();
        int[] dp = new int[len];
        int max = 0;
        for(int i=1;i<len;i++){
            if(s.charAt(i) == ')'){
                if(s.charAt(i-1) == '('){
                    dp[i] = dp[Math.max(0,i-2)] +2;
                }else if(i-1-dp[i-1]>=0 && s.charAt(i-1-dp[i-1]) == '('){
                    dp[i] = dp[i-1] +2 + dp[Math.max(0,i-2-dp[i-1])];
                }
                max = Math.max(max,dp[i]);
            }
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
