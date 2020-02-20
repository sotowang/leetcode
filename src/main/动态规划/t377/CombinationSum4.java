package 动态规划.t377;

/**
 * @auther: sotowang
 * @date: 2020/2/20 15:16
 */
public class CombinationSum4 {
    public int combinationSum4(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num :
                    nums) {
                if (i >= num) {
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {
        int[] nums1 = {1};
        assert new CombinationSum4().combinationSum4(nums1, 1) == 1;
        int[] nums = {1, 2, 3};
        assert new CombinationSum4().combinationSum4(nums, 4) == 7;
    }
}
