package 动态规划.背包问题.t416;

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
        //dp[i][j] ==> 在nums[0]-[i-1]内可以找到和为j的子数组
        boolean[][] dp = new boolean[nums.length][sum + 1];
        if (nums[0] <= sum) {
            dp[0][nums[0]] = true;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= sum; j++) {
                if (dp[i - 1][j] || nums[i] == j || (j >= nums[i] && dp[i - 1][j - nums[i]])) {
                    dp[i][j] = true;
                }
            }
        }
        return dp[nums.length - 1][sum];
    }

    public static void main(String[] args) {
        int[] nums2 = {3, 3, 3, 4, 5};
        assert new CanPartition().canPartition(nums2) == true;
        int[] nums1 = {1, 2, 5};
        assert new CanPartition().canPartition(nums1) == false;
        int[] nums = {1, 5, 11, 5};
        assert new CanPartition().canPartition(nums) == true;

    }
}
