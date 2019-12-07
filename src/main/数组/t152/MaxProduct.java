package 数组.t152;

import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2019/12/07 10:39
 */
public class MaxProduct {
//    public int maxProduct(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return 0;
//        }
//        long max = Integer.MIN_VALUE;
//        int temp = 1;
//        int start = 0, window = 0;
//        while (start < nums.length) {
//            if (start + window < nums.length) {
//                temp *= nums[start + window];
//                if (temp > max) {
//                    max = temp;
//                }
//                window++;
//            } else {
//                start++;
//                window = 0;
//                temp = 1;
//            }
//        }
//
//        return (int) max;
//    }
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int imax = 1;
        int imin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(nums[i] * imax, nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);
            max = Math.max(imax, max);
        }
        return  max;
    }

    public static void main(String[] args) {
        int[] nums5 = {-1, -1};
        System.out.println(new MaxProduct().maxProduct(nums5));
        int[] nums4 = {-2, 3, -4};
        System.out.println(new MaxProduct().maxProduct(nums4));
        int[] nums3 = {0, 2};
        System.out.println(new MaxProduct().maxProduct(nums3));
        int[] nums = {2, 3, -2, 4};
        System.out.println(new MaxProduct().maxProduct(nums));
        int[] nums1 = {-2, 0, -1};
        System.out.println(new MaxProduct().maxProduct(nums1));
    }
}
