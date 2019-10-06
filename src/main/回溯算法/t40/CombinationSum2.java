package 回溯算法.t40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List result = new ArrayList();
        if (candidates == null || candidates.length == 0) {
            return result;
        }
        Arrays.sort(candidates);
        findCombinationSum2(candidates, 0, target, new Stack<Integer>(), result);
        return result;

    }

    private void findCombinationSum2(int[] candidates, int start, int target, Stack<Integer> path, List result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length && candidates[i] <= target; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.push(candidates[i]);
            findCombinationSum2(candidates, i+1, target - candidates[i], path, result);
            path.pop();
        }

    }

    public static void main(String[] args) {
//        List<List<Integer>> result = new CombinationSum2().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
//        for (int i = 0; i < result.size(); i++) {
//            System.out.println(result.get(i));
//        }
        System.out.println(new CombinationSum2().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

}
