package 哈希表.t387;

/**
 * @auther: sotowang
 * @date: 2020/2/29 13:26
 */
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        if (s.isEmpty()) {
            return -1;
        }
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (chars[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        assert new FirstUniqChar().firstUniqChar("leetcode") == 0;
        assert new FirstUniqChar().firstUniqChar("loveleetcode") == 2;
    }
}
