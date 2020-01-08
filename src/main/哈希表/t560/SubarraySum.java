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
        int sum = Arrays.stream(nums).sum();
        if (sum < k) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

        }
    }
}
