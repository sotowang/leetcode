package 回溯算法.t698;

import java.util.ArrayList;
import java.util.Arrays;

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
        Arrays.sort(nums);
        return backTrace(nums, sum, sum,k, new ArrayList<>(), 0, new ArrayList<>());

    }
    private boolean backTrace(int[] nums,
                           int target,
                           int sum,
                           int k,
                           ArrayList<Integer> tem,
                           int start,
                           ArrayList<ArrayList> res) {
        if (target < 0 || start >= nums.length) {
            return false;
        } else if (target == nums[start]) {
            tem.add(nums[start]);
            res.add(new ArrayList(tem));
            tem.clear();
            target = sum;
        } else if (target > nums[start]) {
            tem.add(nums[start]);
            target -= nums[start];
        }else {
            return false;
        }

        if (res.size() == k &&target == sum) {
            return true;
        }
        if (backTrace(nums, target, sum, k, tem, start + 1, res) && res.size() == k) {
            return true;
        }
        if (tem.size() > 0) {
            tem.remove(tem.size() - 1);
        }
        if (res.size() > 0) {
            res.remove(res.size() - 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        assert new CanPartitionKSubsets().canPartitionKSubsets(nums, 4) == true;
    }
}
