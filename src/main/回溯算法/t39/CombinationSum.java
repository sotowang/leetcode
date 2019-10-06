package 回溯算法.t39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List result = new ArrayList();
        if (candidates == null || candidates.length == 0) {
            return result;
        }
        Arrays.sort(candidates);
        findCombinationSUm(candidates,0,target,result,new Stack<Integer>());
        return result;

    }

    private void  findCombinationSUm(int[] candidates, int start , int target, List result, Stack<Integer> path) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length && candidates[i] <= target; i++) {
            path.push(candidates[i]);
            findCombinationSUm(candidates, i,target - candidates[i], result, path);
            path.pop();
        }
    }

    public static void main(String[] args) {
//        System.out.println(new CombinationSum().combinationSum(new int[]{2, 3, 6, 7}, 7));
        System.out.println(new CombinationSum().combinationSum(new int[]{8,7,4,3}, 11));

    }
}
