package 数组.t189;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/12/07 11:21
 */
public class Rotate {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while ( start < end) {
            int tem = nums[start];
            nums[start] = nums[end];
            nums[end] = tem;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums2 = {1, 2, 3};
        new Rotate().rotate(nums2, 4);
        Arrays.stream(nums2).forEach(e -> System.out.print(e + " "));

        System.out.println();

        int[] nums1 = {-1,-2};
        new Rotate().rotate(nums1, 3);
        Arrays.stream(nums1).forEach(e -> System.out.print(e + " "));

        System.out.println();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        new Rotate().rotate(nums, 2);
        Arrays.stream(nums).forEach(e -> System.out.print(e + " "));
    }
}
