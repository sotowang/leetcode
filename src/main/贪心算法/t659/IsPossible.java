package 贪心算法.t659;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2020/05/03 17:10
 */
public class IsPossible {
    public boolean isPossible(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        Map<Integer, Integer> cntMap = new HashMap<>();
        for (int n : nums) {
            cntMap.put(n, cntMap.getOrDefault(n, 0) + 1);
        }
        Map<Integer, Integer> endMap = new HashMap<>();
        for (int n : nums) {
            int count = cntMap.getOrDefault(n, 0);
            if (count == 0) {
                continue;
            }
            cntMap.put(n, count - 1);
            //如果以n-1结尾的子数组存在,则将n加入子数组中
            if ((count = endMap.getOrDefault(n - 1, 0)) > 0) {
                endMap.put(n, endMap.getOrDefault(n, 0) + 1);
                endMap.put(n - 1, count - 1);
                //如果以n-1结尾的数组不存在，则以n为开头找n+1和n+2是否存在
            } else if (cntMap.getOrDefault(n + 1, 0) > 0 && cntMap.getOrDefault(n + 2, 0) > 0) {
                //如果存在，将n+2作为尾放入endMap
                endMap.put(n + 2, endMap.getOrDefault(n + 2, 0) + 1);
                cntMap.put(n + 1, cntMap.get(n + 1) - 1);
                cntMap.put(n + 2, cntMap.get(n + 2) - 1);
            } else { //如果上述都不满足，则不存在能和n拼接的数组
                return false;
            }
        }
        return true;
    }
}
