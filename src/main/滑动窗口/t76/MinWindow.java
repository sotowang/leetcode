package 滑动窗口.t76;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2019/11/02 20:03
 */
public class MinWindow {
    public String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || s.length() < t.length()) {
            return "";
        }
        //左右指针
        int left = 0;
        int right = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        Map<Character, Integer> windowMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        int match = 0;
        while (right < s.length()) {
            char temChar = s.charAt(right);
            windowMap.put(temChar, windowMap.getOrDefault(temChar, 0) + 1);
            if (tMap.containsKey(temChar)) {
                if (tMap.get(temChar) >= windowMap.get(temChar)) {
                    match++;
                }
            }
            right++;
            //判断窗口内字符是否满足t中所有字符
            while (match == t.length()) {
                //判断是否为目前最小的字符串
                if (right - left < minLen) {
                    start = left;
                    minLen = right - left;
                }
                char tempS = s.charAt(left);
                windowMap.put(tempS, windowMap.get(tempS) - 1);
                if (tMap.containsKey(tempS)) {
                    if (windowMap.get(tempS) < tMap.get(tempS)) {
                        match--;
                    }
                }
                //右移left,缩小窗口
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, minLen + start);
    }

    public static void main(String[] args) {
        System.out.println(new MinWindow().minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(new MinWindow().minWindow("aa", "aa"));
    }
}
