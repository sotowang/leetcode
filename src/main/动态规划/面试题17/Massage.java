package 动态规划.面试题17;

/**
 * @auther: sotowang
 * @date: 2020/3/24 13:16
 */
public class Massage {
    public int massage(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int[] dp = new int[nums.length+1];
        dp[1] = nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i+1] = Math.max(dp[i-1]+nums[i],dp[i]);
        }
        return dp[nums.length];
    }
}
