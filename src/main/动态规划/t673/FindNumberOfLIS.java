package 动态规划.t673;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/3/17 21:02
 */
public class FindNumberOfLIS {
    public int findNumberOfLIS(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return nums.length;
        int[] dp = new int[nums.length];
        int[] count = new int[nums.length];
        Arrays.fill(dp,1);
        Arrays.fill(count,1);
        int max = 0;
        for(int i=1;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[i]>nums[j]){
                    if(dp[j]+1>dp[i]){
                        dp[i] = dp[j]+1;

                        count[i] = count[j];
                    } else if(dp[j]+1 == dp[i]){
                        count[i]+=count[j];
                    }
                }
            }
            max = Math.max(dp[i],max);
        }
        int res = 0;
        for(int i=dp.length-1;i>=0;i--){
            if(dp[i] == max){
                res += count[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        assert new FindNumberOfLIS().findNumberOfLIS(nums) == 2;
    }
}
