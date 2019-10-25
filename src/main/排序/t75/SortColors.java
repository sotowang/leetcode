package 排序.t75;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/10/24 22:09
 */
public class SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int length = nums.length;
        int p0 = 0;
        int p2 = length-1;
        int cur = 0;

        while (cur <= p2) {
            if (nums[cur] == 2) {
                swap(nums, cur, p2);
                p2--;
            } else if (nums[cur] == 0) {
                swap(nums, cur, p0);
                cur++;
                p0++;
            } else {
                cur++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        int[] nums = new int[]{2, 0, 1};
        new SortColors().sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
