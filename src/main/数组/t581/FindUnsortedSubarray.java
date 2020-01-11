package 数组.t581;

/**
 * @auther: sotowang
 * @date: 2020/01/11 10:15
 */
public class FindUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = 0;
        int min = nums.length - 1;
        int start = 0;
        int end = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[max]) {
                max = i;
            } else{
                end = i;
                break;
            }
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[min]) {
                start = i + 1;
            }
        }
        return end > start ? end - start + 1 : 0;
    }

    public static void main(String[] args) {
        int[] nums3 = {1, 2, 4, 5, 3};
        assert new FindUnsortedSubarray().findUnsortedSubarray(nums3) == 3;
        int[] nums2 = {2, 3, 3, 2, 4};
        assert new FindUnsortedSubarray().findUnsortedSubarray(nums2) == 3;
        int[] nums1 = {1, 3, 2, 2, 2};
        assert new FindUnsortedSubarray().findUnsortedSubarray(nums1) == 4;
        int[] nums = {2, 6, 4, 8, 10, 9, 15};
        assert new FindUnsortedSubarray().findUnsortedSubarray(nums) == 5;

    }
}
