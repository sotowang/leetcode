package 动态规划.t55;

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
        int len = nums.length;

        int mark = len - 1;
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] >= (mark-i)) {
                mark = i;
            }
        }
        return mark == 0;
    }

    public static void main(String[] args) {
        int[] nums7 = {3,0,8,2,0,0,1};
        System.out.println(new CanJump().canJump(nums7));
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
