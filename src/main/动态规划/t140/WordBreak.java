package 动态规划.t140;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/2/14 18:28
 */
public class WordBreak {
    public List<String> wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        HashMap<Integer, List> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < wordDict.size(); i++) {
            max = Math.max(wordDict.get(i).length(), max);
        }
        //catsanddog
        //先判断，避免超出内存限制
        for (int i = 1; i <= s.length(); i++) {
            for (int j = Math.max(0, i - max); j <= i; j++) {
                String str = s.substring(j, i);
                if (dp[j] && wordDict.contains(str)) {
                    dp[i] = true;
                }
            }
        }
        if (!dp[s.length()]) {
            return new ArrayList<>();
        }
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i + 1; j <= Math.min(s.length(), i + max); j++) {
                str = s.substring(i, j);
                if (wordDict.contains(str)) {
                    if (map.containsKey(str.length() + i)) {
                        List<String> list = map.get(str.length() + i);
                        List<String> nowList = map.getOrDefault(i, new ArrayList<>());
                        for (String temStr :
                                list) {
                            nowList.add(str + " " + temStr);
                        }
                        map.put(i, nowList);
                    } else if (str.length() + i == s.length()) {
                        List<String> list = map.getOrDefault(i, new ArrayList<>());
                        list.add(str);
                        map.put(i, list);
                    }
                }
            }
        }
        if (!map.containsKey(0)) {
            return new ArrayList<>();
        }
        return map.get(0);
    }


    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
        System.out.println(new WordBreak().wordBreak("catsanddog", wordDict));
        List<String> wordDict4 = new ArrayList<>(Arrays.asList("aaaa", "aa", "a"));
        System.out.println(new WordBreak().wordBreak("aaaaaaa", wordDict4));
        List<String> wordDict3 = new ArrayList<>(Arrays.asList("a"));
        System.out.println(new WordBreak().wordBreak("a", wordDict3));
        List<String> wordDict2 = new ArrayList<>(Arrays.asList("cats", "dog", "sand", "and", "cat"));
        System.out.println(new WordBreak().wordBreak("catsandog", wordDict2));
        List<String> wordDict1 = new ArrayList<>(Arrays.asList("apple", "pen", "applepen", "pine", "pineapple"));
        System.out.println(new WordBreak().wordBreak("pineapplepenapple", wordDict1));
    }
}
