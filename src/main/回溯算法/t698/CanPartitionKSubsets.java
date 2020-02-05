package 回溯算法.t698;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @auther: sotowang
 * @date: 2020/2/4 18:01
 */
public class CanPartitionKSubsets {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        if (nums.length < k) {
            return false;
        }
        int sum = Arrays.stream(nums).sum();
        if (sum % k != 0) {
            return false;
        }
        sum /= k;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Arrays.sort(nums);
        if (nums[nums.length - 1] > sum) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        return backTrace(sum, hashMap, k, sum, nums);

    }

    private boolean backTrace(int target,
                              HashMap<Integer, Integer> hashMap,
                              int k,
                              int sum,
                              int[] nums) {
        if (target == 0) {
            if (k - 1 == 0) {
                return true;
            } else {
                return backTrace(sum, hashMap, k - 1, sum, nums);
            }
        } else {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i]<= target && hashMap.containsKey(nums[i]) && hashMap.get(nums[i]) > 0) {
                    hashMap.put(nums[i], hashMap.get(nums[i]) - 1);
                    if (backTrace(target - nums[i], hashMap, k, sum, nums)) {
                        return true;
                    } else {
                        hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        int[] nums2 = {10, 10, 10, 7, 7, 7, 7, 7, 7, 6, 6, 6};
        assert new CanPartitionKSubsets().canPartitionKSubsets(nums2, 3) == true;
        int[] nums1 = {85, 35, 40, 64, 86, 45, 63, 16, 5364, 110, 5653, 97, 95};
        assert new CanPartitionKSubsets().canPartitionKSubsets(nums1, 7) == false;
        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        assert new CanPartitionKSubsets().canPartitionKSubsets(nums, 4) == true;
    }
}
