package 动态规划.t140;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/2/14 18:28
 */
public class WordBreak {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        backTrace(s, 0, 1, new ArrayList<>(), res, wordDict);
        return res;
    }

    private boolean backTrace(String s, int start, int end,
                              ArrayList<String> temp,
                              List<String> res,
                              List<String> wordDict) {
        if (start >= s.length()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < temp.size() - 1; i++) {
                sb.append(temp.get(i)).append(" ");
            }
            if (temp.size() >= 1) {
                sb.append(temp.get(temp.size() - 1));
            }
            res.add(sb.toString());
            return true;
        }
        if (end > s.length()) {
            return false;
        }

        String str = s.substring(start, end);
        temp.add(str);
        if (wordDict.contains(str) && backTrace(s, end, end + 1, temp, res, wordDict)) {
            temp.remove(str);
            backTrace(s, start, end + 1, temp, res, wordDict);
            return true;
        }
        temp.remove(str);
        backTrace(s, start, end + 1, temp, res, wordDict);

        return false;
    }

    public static void main(String[] args) {
        List<String> wordDict4 = new ArrayList<>(Arrays.asList("aaaa", "aa", "a"));
        System.out.println(new WordBreak().wordBreak("aaaaaaa", wordDict4));

        List<String> wordDict3 = new ArrayList<>(Arrays.asList("a"));
        System.out.println(new WordBreak().wordBreak("a", wordDict3));
        List<String> wordDict2 = new ArrayList<>(Arrays.asList("cats", "dog", "sand", "and", "cat"));
        System.out.println(new WordBreak().wordBreak("catsandog", wordDict2));
        List<String> wordDict1 = new ArrayList<>(Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"));
        System.out.println(new WordBreak().wordBreak("pineapplepenapple", wordDict1));
        List<String> wordDict = new ArrayList<>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
        System.out.println(new WordBreak().wordBreak("catsanddog", wordDict));
    }
}
