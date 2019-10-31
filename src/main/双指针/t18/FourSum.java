package 双指针.t18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/10/31 21:25
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int cur = start + 1;
                //更新end
                end = nums.length - 1;
                while (cur < end) {
                    int sum = nums[i] + nums[start] + nums[cur] + nums[end];
                    if (sum  == target) {
                        res.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[start], nums[cur], nums[end])));
                        //去重处理
                        while (cur < nums.length - 1 && nums[cur] == nums[cur + 1]) {
                            cur++;
                        }
                        cur++;
                    } else if (sum < target) {
                        cur++;
                    } else {
                        end--;
                    }
                }
                //去重处理
                while (start <nums.length - 1 &&nums[start] == nums[start + 1]) {
                    start++;
                }
                start++;
            }
            while (i<nums.length - 1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
//        int[] nums = new int[]{-3, -2, -1, 0, 0, 1, 2, 3};
//        int[] nums = new int[]{-1, -5, -5, -3, 2, 5, 0, 4};
//        int[] nums = new int[]{0,0,4,-2,-3,-2,-2,-3 ,-1};
        int[] nums = new int[]{0, 0, 0, 0};
        System.out.println(new FourSum().fourSum(nums, 0));
    }
}
