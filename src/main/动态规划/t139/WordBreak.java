package 动态规划.t139;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/08 22:00
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                String temp = s.substring(j, i);
                if (dp[j] && wordDict.contains(temp)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        List<String> list = new ArrayList<>();
        Arrays.stream(words).forEach(e -> list.add(e));
        System.out.println(new WordBreak().wordBreak("leetcode", list));
    }
}
