package 排序.t242;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2019/10/28 22:11
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if ((s == "" && t != "") || (s != "" && t=="")) {
            return false;
        }
        //先判断字符串是否长度相等
        if (s.length() != t.length()) {
            return false;
        }
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
