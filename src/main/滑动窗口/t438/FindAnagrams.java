package 滑动窗口.t438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2019/11/03 16:38
 */
public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) {
            return res;
        }
        //pMap存放p中字符
        int match = 0;
        int left = 0;
        int right = 0;
        Map<Character, Integer> pMap = new HashMap<>();
        Map<Character, Integer> temMap = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
        }
        while (right < s.length()) {
            char temS = s.charAt(right);
            temMap.put(temS, temMap.getOrDefault(temS, 0) + 1);
            if (pMap.containsKey(temS)) {
                if (temMap.get(temS) <= pMap.get(temS)) {
                    match++;
                }
            }
            right++;
            while (match == p.length()) {
                if (right - left == p.length()) {
                    res.add(left);
                }
                char tempS = s.charAt(left);
                temMap.put(tempS, temMap.get(tempS) - 1);
                if (pMap.containsKey(tempS)) {
                    if (temMap.get(tempS) < pMap.get(tempS)) {
                        match--;
                    }
                }
                //右移left,缩小窗口
                left++;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new FindAnagrams().findAnagrams("cbaebabacd", "abc"));
        System.out.println(new FindAnagrams().findAnagrams("abab", "ab"));
        System.out.println(new FindAnagrams().findAnagrams("abacbabc", "abc"));
    }
}
