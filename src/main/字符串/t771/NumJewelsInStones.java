package 字符串.t771;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: sotowang
 * @date: 2020/10/02 16:24
 */
public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for(char c:J.toCharArray()){
            set.add(c);
        }
        int count = 0;
        for(char c:S.toCharArray()){
            if(set.contains(c)){
                count++;
            }
        }
        return count;
    }
}
