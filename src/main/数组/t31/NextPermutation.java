package 数组.t31;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/12/03 21:01
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int firstIndex = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > nums[i - 1]) {
                firstIndex = i;
            }
        }
        if (firstIndex == -1) {
        }

    }
}
