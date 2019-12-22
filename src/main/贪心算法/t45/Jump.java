package 贪心算法.t45;

/**
 * @auther: sotowang
 * @date: 2019/12/22 10:46
 */
public class Jump {
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int step = 0;
        int end = 0;
        int maxPosition = 0;
        for (int i = 0; i < nums.length-1; i++) {
            maxPosition = Math.max(i + nums[i], maxPosition);
            if (i == end) {
                step++;
                end =  maxPosition;
            }
        }
        return step;
    }

    public static void main(String[] args) {
        int[] nums2 = {0};
        System.out.println(new Jump().jump(nums2));
        int[] nums1 = {2, 3, 1, 1};
        System.out.println(new Jump().jump(nums1));
        int[] nums = {2, 3, 1, 1, 4, 2, 1};
        System.out.println(new Jump().jump(nums));
    }
}
