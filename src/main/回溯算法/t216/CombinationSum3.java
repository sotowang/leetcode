package 回溯算法.t216;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/07 11:36
 */
public class CombinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(1, n, k, new ArrayList(), res);

        return res;
    }

    private void dfs(int start, int n, int k, ArrayList<Integer> list, List<List<Integer>> res) {
        if (list.size() == k && n == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= 9; i++) {
            list.add(i);
            //剪枝
            if (list.size() <= k && n - i >= 0) {
                dfs(i + 1, n - i, k, list, res);
            }
            list.remove(list.size() - 1);
        }
    }


    public static void main(String[] args) {
        System.out.println(new CombinationSum3().combinationSum3(2, 18));
        System.out.println(new CombinationSum3().combinationSum3(1, 9));
        System.out.println(new CombinationSum3().combinationSum3(3, 9));
        System.out.println(new CombinationSum3().combinationSum3(3, 7));
    }
}
