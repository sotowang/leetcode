package 动态规划.t368;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/3/9 15:52
 */
public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList();
        if (nums == null || nums.length == 0) {
            return res;
        }
        int[] dp = new int[nums.length];
        //通过pre记录转移路径
        int[] pre = new int[nums.length];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            pre[i] = i;
        }
        int maxIndex = 0;
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    pre[i] = j;
                    if (dp[i] > maxVal) {
                        maxVal = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }
        res.add(nums[maxIndex]);
        //逆向查找路径
        while (pre[maxIndex] != maxIndex) {
            maxIndex = pre[maxIndex];
            res.add(0, nums[maxIndex]);

        }

        return res;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        new LargestDivisibleSubset().largestDivisibleSubset(nums);
    }
}
