package 双指针.t532;

import java.util.Arrays;

/**f
 * @auther: sotowang
 * @date: 2020/1/24 16:10
 */
public class FindPairs {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int res = 0;
        int right = nums.length - 1;
        int left = right - 1;
        while (right > 0) {
            if (left < 0) {
                right--;
                continue;
            }
            if (nums[right] - nums[left] == k) {
                res++;
                while (left > 0 && nums[left] == nums[left - 1]) {
                    left--;
                }
                while (right > 0 && nums[right] == nums[right - 1]) {
                    right--;
                }
                left--;
            } else if (nums[right] - nums[left] < k) {
                left--;
            } else {
                right--;
                left = right - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums3 = {6, 2, 9, 3, 9, 6, 7, 7, 6, 4};
        assert new FindPairs().findPairs(nums3, 3) == 3;
        int[] nums2 = {3, 1, 4, 1, 5};
        assert new FindPairs().findPairs(nums2, 2) == 2;
        int[] nums1 = {1, 3, 1, 5, 4};
        assert new FindPairs().findPairs(nums1, 0) == 1;
        int[] nums = {1, 2, 3, 4, 5};
        assert new FindPairs().findPairs(nums, 1) == 4;
    }
}
