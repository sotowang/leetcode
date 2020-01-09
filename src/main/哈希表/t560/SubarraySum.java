package 哈希表.t560;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @auther: sotowang
 * @date: 2020/01/08 20:59
 */
public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap();
        map.put(0, 1);
        int res = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                res += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        assert new SubarraySum().subarraySum(nums, 2) == 2;

    }
}
