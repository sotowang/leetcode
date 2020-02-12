package 位运算.t540;

/**
 * @auther: sotowang
 * @date: 2020/2/12 21:49
 */
public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 3, 7, 7, 10, 11, 11};
        assert new SingleNonDuplicate().singleNonDuplicate(nums1) == 10;
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        assert new SingleNonDuplicate().singleNonDuplicate(nums) == 2;
    }
}
