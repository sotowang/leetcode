package 哈希表.t5333;

import java.util.HashMap;

/**
 * @auther: sotowang
 * @date: 2020/2/9 15:42
 */
public class MinSteps {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = map.getOrDefault(s.charAt(i), -1);
            if (num == -1 || num == 0) {
                res++;
            } else {
                map.put(s.charAt(i), num - 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        assert new MinSteps().minSteps("friend", "family") == 4;
        assert new MinSteps().minSteps("xxyyzz", "xxyyzz") == 0;
        assert new MinSteps().minSteps("anagram", "mangaar") == 0;
        assert new MinSteps().minSteps("bab", "aba") == 1;
        assert new MinSteps().minSteps("leetcode", "practice") == 5;

    }
}
