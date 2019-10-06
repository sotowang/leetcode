package 字节跳动.string.t1;

import java.util.HashMap;

public class NoduplicateMaxSubString {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int left = 0;
        int max = 0;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                left = Math.max(left, hashMap.get(s.charAt(i)) + 1);
            }
            hashMap.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(new NoduplicateMaxSubString().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new NoduplicateMaxSubString().lengthOfLongestSubstring("bbbbbb"));
    }
}
