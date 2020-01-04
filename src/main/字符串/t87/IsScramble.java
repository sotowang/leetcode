package 字符串.t87;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/01/02 22:10
 */
public class IsScramble {
    public boolean isScramble(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.equals(s2)) {
            return true;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (!Arrays.equals(c1, c2)) {
            return false;
        }
        for (int i = 1; i < s1.length(); i++) {
            //s1前i个字符匹配s2前i个字符
            if (isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(s1.substring(i), s2.substring(i))) {
                return true;
            }
            //s1前i个字符匹配s2后i个字符
            if (isScramble(s1.substring(0, i), s2.substring(s2.length() - i)) && isScramble(s1.substring(i), s2.substring(0, s2.length() - i))) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        assert new IsScramble().isScramble("abc", "bca") == true;
        assert new IsScramble().isScramble("abcde", "caebd") == false;
        assert new IsScramble().isScramble("great", "rgeat") == true;

    }
}
