package 动态规划.t139;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/08 22:00
 */
public class WordBreak {
    public boolean wordBreak1(String s, List<String> wordDict) {
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

    //2020/02/20
    public boolean wordBreak(String s, List<String> wordDict) {
        //dp[i] 以i结尾的字符
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        int maxLen = 0;
        for (int i = 0; i < wordDict.size(); i++) {
            maxLen = Math.max(wordDict.get(i).length(), maxLen);
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = Math.max(0, i - maxLen); j <= i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        List<String> list = new ArrayList<>(Arrays.asList(words));
        assert new WordBreak().wordBreak("leetcode", list) == true;

    }
}
