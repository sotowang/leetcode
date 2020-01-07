package 动态规划.t416;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/01/07 22:11
 */
public class CanPartition {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int sum = Arrays.stream(nums).sum();
        if (sum %2 == 1) {
            return false;
        }
        sum = sum >> 1;


    }
}
