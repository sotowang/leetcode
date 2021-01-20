package 数组.t628;

import java.util.Arrays;

/**
 * @author: sotowang
 * @date: 2021/01/20 16:33
 */
public class MaximumProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);
    }
}
