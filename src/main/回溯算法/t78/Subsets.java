package 回溯算法.t78;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List result = new ArrayList();
        if (nums == null || nums.length == 0) {
            return result;
        }
        getSubsets(nums, 0, result, new Stack<Integer>());
        return result;
    }

    private void getSubsets(int[] nums, int start, List result, Stack<Integer> path) {
        //只要遍历到了，就添加进结果集中
        if (start <= nums.length) {
            result.add(new ArrayList<>(path));
        } else {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            path.push(nums[i]);
            getSubsets(nums, i + 1, result, path);
            path.pop();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Subsets().subsets(new int[]{1, 2, 3}));
    }

}
