package 数组.t1909;

/**
 * @author: sotowang
 * @date: 2021/11/15 21:16
 */
public class CanBeIncreasing {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        int leftMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= leftMax) {
                count++;
                if (count > 1) {
                    break;
                }
            } else {
                leftMax = nums[i];
            }
        }
        if (count <= 1) {
            return true;
        }
        count = 0;
        int rightMax = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= rightMax) {
                count++;
                if (count > 1) {
                    return false;
                }
            } else {
                rightMax = nums[i];
            }
        }
        return true;
    }
}
