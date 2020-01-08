package 动态规划.t494;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/01/08 11:44
 */
public class FindTargetSumWays {
    public int findTargetSumWays(int[] nums, int S) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = Arrays.stream(nums).sum();
        if ((S + sum) % 2 == 1 || sum < S) {
            return 0;
        }
        sum = (S + sum) >> 1;
        //dp代表和为SUM的组合数
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for (int num :
                nums) {
            for (int i = sum; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,7,9,981};
        System.out.println(new FindTargetSumWays().findTargetSumWays(nums1, 1000000000));
        int[] nums = {1, 1, 1, 1, 1};
        System.out.println(new FindTargetSumWays().findTargetSumWays(nums, 3));
    }
}
