package 回溯算法.t46;

import sun.reflect.generics.visitor.Visitor;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        Stack<Integer> path = new Stack();
        boolean[] visited = new boolean[nums.length];
        getPermutation(nums, path, 0, visited, result);
        return result;

    }

    private void getPermutation(int[] nums, Stack<Integer> path, int count,boolean[] visited, List result) {
        if (count == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                path.push(nums[i]);
                visited[i] = true;
                getPermutation(nums, path, count + 1, visited, result);
                path.pop();
                visited[i] = false;
            }
        }

    }

    public static void main(String[] args) {
        List<List<Integer>> result = new Permute().permute(new int[]{1, 1, 2});
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
