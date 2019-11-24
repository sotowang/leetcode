package 哈希表.t299;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @auther: sotowang
 * @date: 2019/11/24 20:26
 */
public class GetHint {
    public String getHint(String secret, String guess) {
        if (secret.length() != guess.length()) {
            return "0A0B";
        }
        int a = 0;
        int b = 0;
        Map<Character,Integer> map = new HashMap<>();
        Map<Integer,Integer> mapA = new HashMap<>();
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                a++;
                //记录A的位置
                mapA.put(i, i);
            } else {
                map.put(secret.charAt(i), map.getOrDefault(secret.charAt(i), 0) + 1);
            }
        }
        for (int i = 0; i < guess.length(); i++) {
            if (mapA.containsKey(i)) {
                continue;
            }
            int count = map.getOrDefault(guess.charAt(i), 0);
            if (count > 0) {
                b++;
                map.put(guess.charAt(i), count - 1);
            }
        }
        return a + "A" + b + "B";
    }

    public static void main(String[] args) {
        String secret3 = "11";
        String guess3 = "10";
        System.out.println(new GetHint().getHint(secret3, guess3));
        String secret1 = "1807";
        String guess1 = "7810";
        System.out.println(new GetHint().getHint(secret1, guess1));
        String secret2 = "1123";
        String guess2= "0111";
        System.out.println(new GetHint().getHint(secret2, guess2));

    }
}
