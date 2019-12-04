package 数组.t31;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/12/03 21:01
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int firstIndex = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                firstIndex = i - 1;
                break;
            }
        }
        if (firstIndex == -1) {
            reverse(nums, 0, nums.length - 1);
        } else {
            int secondIndex = -1;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[firstIndex]) {
                    secondIndex = i;
                    break;
                }
            }
            swap(nums, firstIndex, secondIndex);
            reverse(nums, firstIndex + 1, nums.length - 1);
        }
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums3 = {
                1
        };
        new NextPermutation().nextPermutation(nums3);
        Arrays.stream(nums3).forEach(System.out::print);

        System.out.println();
        int[] nums1 = {
                1, 2, 7, 4, 3, 1
        };
        new NextPermutation().nextPermutation(nums1);
        Arrays.stream(nums1).forEach(System.out::print);

        System.out.println();


        int[] nums2 = {
                1,2,3
        };
        new NextPermutation().nextPermutation(nums2);
        Arrays.stream(nums2).forEach(System.out::print);
    }
}
