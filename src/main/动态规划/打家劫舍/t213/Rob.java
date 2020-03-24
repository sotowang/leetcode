package 动态规划.打家劫舍.t213;

/**
 * @auther: sotowang
 * @date: 2019/12/13 22:00
 */
public class Rob {
    public int rob1(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int n = nums.length;
        int[] dp1 = new int[n + 1];
        int[] dp2 = new int[n + 1];
        //偷第一个
        dp1[0] = 0;
        dp1[1] = nums[0];

        //不偷第一个
        dp2[0] = 0;
        dp2[1] = 0;
        for (int i = 1; i < n; i++) {
            dp1[i + 1] = Math.max(dp1[i], dp1[i - 1] + nums[i]);
            dp2[i + 1] = Math.max(dp2[i], dp2[i - 1] + nums[i]);
        }
        return Math.max(dp1[n - 1], dp2[n]);

    }

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        //偷第一个
        int[] dp1 = new int[nums.length + 1];
        dp1[1] = nums[0];
        //不偷第一个
        int[] dp2 = new int[nums.length + 1];

        for (int i = 2; i <= nums.length; i++) {
            dp1[i] = Math.max(dp1[i - 2] + nums[i - 1], dp1[i - 1]);
            dp2[i] = Math.max(dp2[i - 2] + nums[i - 1], dp2[i - 1]);
        }
        return Math.max(dp1[nums.length - 1], dp2[nums.length]);
    }


    public static void main(String[] args) {
        int[] nums3 = {0};
        System.out.println(new Rob().rob(nums3) == 0);
        int[] nums2 = {1};
        System.out.println(new Rob().rob(nums2) == 1);

        int[] nums = {2, 3, 2};
        System.out.println(new Rob().rob(nums) == 3);

        int[] nums1 = {1, 2, 3, 1};
        System.out.println(new Rob().rob(nums1) == 4);


    }
}
