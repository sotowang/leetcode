package 数组.子数组.t581;

/**
 * @auther: sotowang
 * @date: 2020/01/11 10:15
 */
public class FindUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int max = nums[0];
        int min = nums[nums.length - 1];
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
            } else{
                end = i;
            }
            if (nums[nums.length - 1 - i] <= min) {
                min = nums[nums.length - 1 - i];
            } else {
                start = nums.length - 1 - i;
            }
        }
        return end > start ? end - start + 1 : 0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 2, 2, 2};
        assert new FindUnsortedSubarray().findUnsortedSubarray(nums1) == 4;
        int[] nums3 = {1, 2, 4, 5, 3};
        assert new FindUnsortedSubarray().findUnsortedSubarray(nums3) == 3;
        int[] nums2 = {2, 3, 3, 2, 4};
        assert new FindUnsortedSubarray().findUnsortedSubarray(nums2) == 3;
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        assert new FindUnsortedSubarray().findUnsortedSubarray(nums) == 5;

    }
}
