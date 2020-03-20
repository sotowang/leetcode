package 动态规划.t300;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/11/22 20:33
 */
public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = nums[i] > nums[j] ? Math.max(dp[i], dp[j] + 1) : dp[i];
            }
        }
        return  Arrays.stream(dp).max().getAsInt();
    }

    public static void main(String[] args) {
//        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums = {2, 1, 3,3, 2, 5};
        System.out.println(new LengthOfLIS().lengthOfLIS(nums));
    }
}
