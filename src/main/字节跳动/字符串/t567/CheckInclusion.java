package 字节跳动.字符串.t567;

import java.util.Arrays;

/**
 * 第一个字符串的子串的排列之一为每二个字符串的子串
 */
public class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        int window = s1.length();
        char[] windowChar = new char[26];
        char[] slidChar = new char[26];
        for (char c :
                s1.toCharArray()) {
            windowChar[c - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            if (i >= window) {
                --slidChar[s2.charAt(i - window)-'a'];
            }
            slidChar[s2.charAt(i) - 'a']++;
            if (Arrays.equals(slidChar, windowChar)) {
                return true;
            }
        }
        return false;


    }

    public static void main(String[] args) {
        System.out.println(new CheckInclusion().checkInclusion("ab", "eiaboaoo"));
    }
}
