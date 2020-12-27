package 哈希表.t205;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2019/11/24 19:32
 */
public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                //ab--aa反例
                if (map.containsValue(t.charAt(i))) {
                    return false;
                }
                //映射
                map.put(s.charAt(i), t.charAt(i));
            } else if (map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //...
        System.out.println(new IsIsomorphic().isIsomorphic("ab", "aa"));
        System.out.println(new IsIsomorphic().isIsomorphic("egg", "add"));
        System.out.println(new IsIsomorphic().isIsomorphic("foo", "bar"));
        System.out.println(new IsIsomorphic().isIsomorphic("paper", "title"));
    }
}
