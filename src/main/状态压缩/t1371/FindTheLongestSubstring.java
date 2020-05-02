package 状态压缩.t1371;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2020/05/02 21:49
 */
public class FindTheLongestSubstring {
    public int findTheLongestSubstring(String s) {
        char[] vowels = {'a','e','i','o','u'};
        Map<Integer,Integer> map = new HashMap<>();
        int len  = s.length();
        int state = 0;
        map.putIfAbsent(state,-1);
        int max  = 0;
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            for(int j=0;j<vowels.length;j++){
                if(c == vowels[j]){
                    state ^= (1<<vowels.length-j-1);
                    break;
                }
            }
            if(map.containsKey(state)){
                max = Math.max(max,i-map.get(state));
            }
            map.putIfAbsent(state,i);
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
