package 动态规划.打家劫舍.t198;

/**
 * @auther: sotowang
 * @date: 2019/12/09 20:11
 */
public class Rob {
    public int rob1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //前i个房屋的最大值
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i + 1] = Math.max(dp[i - 1] + nums[i], dp[i]);
        }
        return dp[nums.length];
    }

    //2020/02/19
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int last = 0, second, now;
        second = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            now = Math.max(nums[i - 1] + last, second);
            last = second;
            second = now;
        }
        return second;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 9, 3, 1};
        assert new Rob().rob(nums1) == 12;
        int[] nums = {1, 2, 3, 1};
        assert new Rob().rob(nums) == 4;
    }
}
