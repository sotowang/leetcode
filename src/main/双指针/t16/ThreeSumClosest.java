package 双指针.t16;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/10/30 21:57
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3 ) {
            return 0;
        }
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                if (sum == target) {
                    return sum;
                }
                if (sum < target) {
                    start++;
                }else{
                    end--;
                }
                if (Math.abs(sum - target) < Math.abs(res - target)) {
                    res = sum;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{-1, 2, 1, -4};
        int[] nums = new int[]{0, 2, 1};
        System.out.println(new ThreeSumClosest().threeSumClosest(nums, 3));
    }
}
