package 二分查找.t154;

/**
 * @auther: sotowang
 * @date: 2020/2/12 22:30
 */
public class FindMin {
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                return nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 2, 2, 0};
        assert new FindMin().findMin(nums1) == 0;
        int[] nums = {1, 3, 5};
        assert new FindMin().findMin(nums) == 1;

    }
}
