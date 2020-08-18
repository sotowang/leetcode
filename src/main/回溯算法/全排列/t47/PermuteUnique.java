package 回溯算法.全排列.t47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PermuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        findPermuteUnique(nums, 0, new Stack<Integer>(),result,visited);
        return result;
    }

    private void findPermuteUnique(int[] nums, int count, Stack<Integer> path, List<List<Integer>> result, boolean[] visited) {
        if (nums.length == count) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1] && !visited[i-1]) {
                continue;
            }

            if (!visited[i]) {
                path.push(nums[i]);
                visited[i] = true;
                findPermuteUnique(nums, count + 1, path, result, visited);
                path.pop();
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> result = new PermuteUnique().permuteUnique(new int[]{3, 3, 0, 3});
//        List<List<Integer>> result = new PermuteUnique().permuteUnique(new int[]{1, 1, 2});
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

}
