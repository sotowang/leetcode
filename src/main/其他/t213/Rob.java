package 其他.t213;

/**
 * @auther: sotowang
 * @date: 2019/12/13 22:00
 */
public class Rob {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int[][] dp = new int[n + 1][2];
        dp[0][1] = 1;
        dp[0][0] = 0;
        for (int i = 1; i < n; i++) {
            int index = i - 1;
            dp[i][0] = Math.max(dp[index][0], dp[index][1]);
            dp[i][1] = dp[index][0] + nums[index];
        }
        return Math.max(dp[n-1][0], dp[n-1][1]);
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        System.out.println(new Rob().rob(nums));
    }
}
