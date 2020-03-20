package 双指针.t3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wst
 * @create 2019-09-09 16:06
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len == 0 || len ==1) return len;
        Map<Character,Integer> map = new HashMap();
        int left=0,max=0;
        for(int i=0;i<len;i++){
            char tem = s.charAt(i);
            if(map.containsKey(tem)){
                left = Math.max(left,map.get(tem)+1);
            }
            map.put(tem,i);
            max = Math.max(max,i-left+1);

        }
        return max;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring solution = new LengthOfLongestSubstring();
        int res = solution.lengthOfLongestSubstring("abba");
        System.out.println(res);
    }



}

