package 哈希表.t1218;

import java.util.HashMap;

/**
 * @auther: sotowang
 * @date: 2020/05/12 21:07
 */
public class LongestSubsequence {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 1;
        for(int i=0;i<arr.length;i++){
            int val = map.getOrDefault(arr[i]-difference,0);
            map.put(arr[i],val+1);
            max = Math.max(val+1,max);
        }
        return max;
    }
}
