package 数组.t334;

/**
 * @auther: sotowang
 * @date: 2020/01/10 11:17
 */
public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        //min,subMin分别记录数组中最小值和次最小值
        int min = nums[0];
        int subMin = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > subMin) {
                return true;
            } else if (nums[i] < min){
                min = nums[i];
            } else if (nums[i] < subMin && nums[i] != min) {
                subMin = nums[i];
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums4 = {1, 1, -2, 6};
        assert new IncreasingTriplet().increasingTriplet(nums4) == false;
        int[] nums3 = {5, 1, 5, 5, 2, 5, 4};
        assert new IncreasingTriplet().increasingTriplet(nums3) == true;
        int[] nums2 = {2, 1, 5, 0, 3};
        assert new IncreasingTriplet().increasingTriplet(nums2) == false;
        int[] nums1 = {2, 5, 3, 4, 5};
        assert new IncreasingTriplet().increasingTriplet(nums1) == true;
        int[] nums = {1, 2, 4, 3, 5};
        assert new IncreasingTriplet().increasingTriplet(nums) == true;

    }
}
