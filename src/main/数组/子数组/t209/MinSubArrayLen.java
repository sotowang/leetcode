package 数组.子数组.t209;

/**
 * @auther: sotowang
 * @date: 2019/11/04 14:23
 */
public class MinSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums[0] > s || nums.length == 1) {
            return nums[0] > s ? 1 : 0;
        }
        int left = 0;
        int right = 1;
        int sum = nums[left] + nums[right];
        int count = Integer.MAX_VALUE;
        while (right < nums.length) {
            if (sum >= s) {
                count = count > right - left + 1 ? right - left + 1 : count;
                //left++时更新sum的值
                sum -= nums[left++];
            } else {
                right++;
                if (right < nums.length) {
                    sum += nums[right];
                } else {
                    break;
                }
            }
        }
        return count == Integer.MAX_VALUE ? 0 : count;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
//        System.out.println(new MinSubArrayLen().minSubArrayLen(7, nums));
        int[] nums1 = new int[]{10, 2, 3};
        System.out.println(new MinSubArrayLen().minSubArrayLen(6, nums1));
    }
}
