package 动态规划.t139;

import java.util.*;

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
    public boolean wordBreak2(String s, List<String> wordDict) {
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

    //2020-06-25
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dicSet = new HashSet<>();
        int len = s.length();
        boolean[] dp = new boolean[len+1];
        int maxLen = Integer.MIN_VALUE;
        int size = wordDict.size();
        dp[0] = true;
        for(int i=0;i<size;i++ ){
            maxLen = Math.max(maxLen,wordDict.get(i).length());
            dicSet.add(wordDict.get(i));
        }
        for(int i=1;i<= len;i++){
            for(int j=Math.max(0,i-maxLen);j<=i;j++){
                //List判断 contains时是遍历的，set是用的hashMap
                if(dp[j] && dicSet.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }

    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        List<String> list = new ArrayList<>(Arrays.asList(words));
        assert new WordBreak().wordBreak("leetcode", list) == true;

    }
}
