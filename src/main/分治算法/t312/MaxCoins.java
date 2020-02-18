package 分治算法.t312;

/**
 * @auther: sotowang
 * @date: 2020/01/11 20:10
 */
public class MaxCoins {
    public int maxCoins(int[] nums) {
        int[] nums2 = new int[nums.length + 2];
        nums2[0] = 1;
        nums2[nums2.length - 1] = 1;
        for (int i = 0; i < nums.length; i++) {
            nums2[i + 1] = nums[i];
        }
        int[][] dp = new int[nums2.length][nums2.length];
        return dfs(nums2, 0, nums2.length - 1, dp);
    }

    private int dfs(int[] nums, int start, int end, int[][] dp) {
        if (start + 1 == end) {
            return 0;
        }
        if (dp[start][end] != 0) {
            return dp[start][end];
        }
        int max = 0;
        for (int i = start + 1; i < end; i++) {
            max = Math.max(dfs(nums, start, i, dp) + dfs(nums, i, end, dp) + nums[start] * nums[i] * nums[end], max);
        }
        dp[start][end] = max;
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 8};
        assert new MaxCoins().maxCoins(nums) == 167;

    }
}
