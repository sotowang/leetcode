package 动态规划.背包问题.ol背包.t416;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/01/07 22:11
 */
public class CanPartition {
    /**
     * 0-1背包问题
     *
     * @param nums
     * @return
     */
    public boolean canPartition1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) {
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

    public boolean canPartition2(int[] nums) {
        if (nums == null || nums.length < 2) return false;
        int sum = Arrays.stream(nums).sum();
        if ((sum & 1) == 1) {
            return false;
        }
        sum >>= 1;
        boolean[][] dp = new boolean[nums.length][sum + 1];
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= sum; j++) {
                if (j == nums[i - 1] || dp[i - 1][j] || (j > nums[i - 1] && dp[i - 1][j - nums[i - 1]]))
                    dp[i][j] = true;
            }
        }
        return dp[nums.length - 1][sum];

    }

    /**
     * 优化版本：
     * 上面看到，我们求解dp第i行dp[i][?]的时候，只需要知道第i-1行dp[i-1][?]的值即可。
     * 也就是说，我们没必要开这么大的二维数组空间，直接开一个一维数组空间保存前一行的值就ok了。
     * 下面给出二维转一维的中间过程的代码。在最后会给出清晰的最终代码
     *
     * @param nums
     * @return
     */
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length < 2) return false;
        int sum = Arrays.stream(nums).sum();
        if ((sum & 1) == 1) {
            return false;
        }
        sum >>= 1;
        boolean[] dp = new boolean[sum + 1];
        dp[0] = true;
        if (nums[0] <= sum) {
            dp[nums[0]] = true;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = sum; nums[i] <= j; j--) {
                if (dp[sum]) {
                    return true;
                }
                dp[j] = dp[j] || dp[j - nums[i]];
            }
        }
        return dp[sum];

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5};
        assert new CanPartition().canPartition(nums1) == false;
        int[] nums2 = {3, 3, 3, 4, 5};
        assert new CanPartition().canPartition(nums2) == true;
        int[] nums = {1, 5, 11, 5};
        assert new CanPartition().canPartition(nums) == true;
    }
}
