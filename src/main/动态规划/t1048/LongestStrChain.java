package 动态规划.t1048;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/2/6 18:38
 */
public class LongestStrChain {
    public int longestStrChain(String[] words) {
        List<String> wordList = new ArrayList<>();
        for (String str :
                words) {
            wordList.add(str);
        }
        wordList.sort(Comparator.comparingInt(String::length));
        int[] dp = new int[words.length];
        Arrays.fill(dp, 1);
        int max = 1;
        String shortStr;
        String longStr;

        for (int i = 0; i < wordList.size(); i++) {
             shortStr = wordList.get(i);
            for (int j = i + 1; j < words.length && wordList.get(j).length() <= shortStr.length() + 1; j++) {
                 longStr = wordList.get(j);
                if (longStr.length() == shortStr.length() + 1 && checkIfPreWord(shortStr, longStr)) {
                    dp[j] = Math.max(dp[i] + 1, dp[j]);
                    max = Math.max(dp[j], max);
                }
            }

        }
        return max;
    }

    private boolean checkIfPreWord(String shortStr, String longStr) {
        int i = 0;
        int j = 0;
        int count =0;
        while (i < shortStr.length() && j < longStr.length()) {
            if (shortStr.charAt(i) == longStr.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return i == shortStr.length();
    }

    public static void main(String[] args) {
        String[] words1 = {"ksqvsyq", "ks", "kss", "czvh", "zczpzvdhx", "zczpzvh", "zczpzvhx", "zcpzvh", "zczvh", "gr", "grukmj", "ksqvsq", "gruj", "kssq", "ksqsq", "grukkmj", "grukj", "zczpzfvdhx", "gru"};
        assert new LongestStrChain().longestStrChain(words1) == 7;
        String[] words = {"a", "b", "ba", "bca", "bda", "bdca"};
        assert new LongestStrChain().longestStrChain(words) == 4;
    }
}
