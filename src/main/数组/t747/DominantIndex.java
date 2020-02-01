package 数组.t747;

/**
 * @auther: sotowang
 * @date: 2020/2/1 15:53
 */
public class DominantIndex {
    /**
     * 找第一大和第二大和元素比较
     * @param nums
     * @return
     */
    public int dominantIndex(int[] nums) {
        if (nums == null) {
            return -1;
        }
        int firBig = -1;
        int index = -1;
        int secondBig = -2;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= firBig) {
                secondBig = firBig;
                firBig = nums[i];
                index = i;
            } else if (nums[i] >= secondBig) {
                secondBig = nums[i];
            }
        }
        return firBig >= 2 * secondBig ? index : -1;
    }

    public static void main(String[] args) {
        int[] nums2 = {1};
        assert new DominantIndex().dominantIndex(nums2) == 0;
        int[] nums1 = {3, 6, 1, 0};
        assert new DominantIndex().dominantIndex(nums1) == 1;
        int[] nums = {1, 2, 3, 4};
        assert new DominantIndex().dominantIndex(nums) == -1;
    }
}
