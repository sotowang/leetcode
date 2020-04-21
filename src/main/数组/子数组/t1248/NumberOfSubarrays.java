package 数组.子数组.t1248;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2020/4/21 18:48
 */
public class NumberOfSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum += nums[i]%2;
            if(map.containsKey(sum-k)){
                res+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}
