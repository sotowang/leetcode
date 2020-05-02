package 状态压缩.t1371;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2020/05/02 21:49
 */
public class FindTheLongestSubstring {
    public int findTheLongestSubstring(String s) {
        Map<Integer,Integer> map = new HashMap<>();
        int len  = s.length();
        int state = 0;
        map.putIfAbsent(state,-1);
        int max  = 0;
        for(int i=0;i<len;i++){
            switch (s.charAt(i)) {
                case 'a':
                    state ^= (1 << 0);
                    break;
                case 'e':
                    state ^= (1 << 1);
                    break;
                case 'i':
                    state ^= (1 << 2);
                    break;
                case 'o':
                    state ^= (1 << 3);
                    break;
                case 'u':
                    state ^= (1 << 4);
                    break;
                default:
                    break;
            }
            if(map.containsKey(state)){
                max = Math.max(max,i-map.get(state));
            }
            map.putIfAbsent(state,i);
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "eleetminicoworoep";
        assert new FindTheLongestSubstring().findTheLongestSubstring(s) == 13;
    }
}
