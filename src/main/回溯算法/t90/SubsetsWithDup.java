package 回溯算法.t90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/06 20:59
 */
public class SubsetsWithDup {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, new ArrayList<>(), 0, res);
        return res;
    }

    private void dfs(int[] nums, List list,int  start, List res) {
        res.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            if (i>start && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            dfs(nums, list, i + 1, res);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        System.out.println(new SubsetsWithDup().subsetsWithDup(nums));
    }
}
