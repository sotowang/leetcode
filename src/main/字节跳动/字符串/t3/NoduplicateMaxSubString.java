package 字节跳动.字符串.t3;

import java.util.HashMap;
import java.util.Map;

public class NoduplicateMaxSubString {
    public int lengthOfLongestSubstring1(String s) {
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
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len == 0 || len ==1){
            return len;
        }
        int max = 0,left=0;
        char tem;
        Map<Character,Integer> map = new HashMap();
        for(int right=0;right<len;right++){
            tem = s.charAt(right);
            if(map.containsKey(tem)){
                left = Math.max(left, map.get(tem) + 1);
                max = Math.max(max, right - left + 1);
            }
            map.put(tem,right);
        }

        return max;
    }

    public static void main(String[] args) {
        assert new NoduplicateMaxSubString().lengthOfLongestSubstring("pwwkew") == 3;
        assert new NoduplicateMaxSubString().lengthOfLongestSubstring("abcabcbb") == 3;
        assert new NoduplicateMaxSubString().lengthOfLongestSubstring("bbbbbb") == 1;
    }
}
