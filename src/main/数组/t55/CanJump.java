package 数组.t55;

/**
 * @auther: sotowang
 * @date: 2019/12/04 21:14
 */
public class CanJump {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        if (nums.length == 1) {
            return true;
        }
        boolean[] dp = new boolean[nums.length + 1];
        //置最后一个位置为true
        dp[nums.length] = true;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= nums.length - 1 || (dp[i + 2] && nums[i] + i >= i + 1)) {
                dp[i + 1] = true;
            } else {
                dp[i + 1] = false;
            }
        }
        return dp[1];
    }

    public static void main(String[] args) {
        int[] nums6 = {0, 2, 3};
        System.out.println(new CanJump().canJump(nums6));
        int[] nums5 = {2, 5, 0, 0};
        System.out.println(new CanJump().canJump(nums5));
        int[] nums4 = {1, 2};
        System.out.println(new CanJump().canJump(nums4));
        int[] nums3 = {0};
        System.out.println(new CanJump().canJump(nums3));
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println(new CanJump().canJump(nums1));
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(new CanJump().canJump(nums2));
    }
}
