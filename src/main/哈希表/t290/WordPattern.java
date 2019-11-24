package 哈希表.t290;

import java.util.HashMap;

/**
 * @auther: sotowang
 * @date: 2019/11/24 20:15
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        if (pattern.length() != strings.length) {
            return false;
        }
        HashMap<Character, String> hashMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!hashMap.containsKey(pattern.charAt(i))) {
                if (hashMap.containsValue(strings[i])) {
                    return false;
                }
                hashMap.put(pattern.charAt(i), strings[i]);
            } else {
                if (!hashMap.get(pattern.charAt(i)).equals(strings[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern1 = "abba";
        String str1 = "dog cat cat dog";
        System.out.println(new WordPattern().wordPattern(pattern1, str1));
        String pattern2 = "abba";
        String str2 = "dog cat cat fish";
        System.out.println(new WordPattern().wordPattern(pattern2, str2));
    }
}
