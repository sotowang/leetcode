package 数组.t152;

import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2019/12/07 10:39
 */
public class MaxProduct {
    public int maxProduct1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int imax = 1;
        int imin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(nums[i] * imax, nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);
            max = Math.max(imax, max);
        }
        return  max;
    }
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxTem = 1;
        int minTem = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int tem = maxTem;
                maxTem = minTem;
                minTem = tem;
            }
            maxTem = Math.max(nums[i] * maxTem, nums[i]);
            minTem = Math.min(nums[i] * minTem, nums[i]);
            max = Math.max(maxTem, max);
        }
        return max;
    }

    public int maxProduct2(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            dp[i][i] = nums[i];
            max = Math.max(nums[i], max);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                dp[i][j] = dp[i][j - 1] * nums[j];
                max = Math.max(dp[i][j], max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        assert new MaxProduct().maxProduct(nums) == 6;
        int[] nums5 = {-1, -1};
        assert new MaxProduct().maxProduct(nums5) == 1;
        int[] nums4 = {-2, 3, -4};
        assert new MaxProduct().maxProduct(nums4) == 24;
        int[] nums3 = {0, 2};
        assert new MaxProduct().maxProduct(nums3) == 2;
        int[] nums1 = {-2, 0, -1};
        assert new MaxProduct().maxProduct(nums1) == 0;

    }
}
