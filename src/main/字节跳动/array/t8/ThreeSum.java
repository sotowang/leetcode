package 字节跳动.array.t8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList result = new ArrayList();
        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        if (nums[0] > 0) {
            return result;
        }
        int left, right, sum;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                if (nums[i] > 0) {
                    break;
                }
                sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //去重处理
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    //去重处理
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(new ThreeSum().threeSum(new int[]{}));
        System.out.println(new ThreeSum().threeSum(new int[]{0, 0, 0}));
        System.out.println(new ThreeSum().threeSum(new int[]{-1, 0, 1, 0}));
    }
}
