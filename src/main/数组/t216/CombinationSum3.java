package 数组.t216;

import java.util.ArrayList;
import java.util.LinkedList;
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
        list.add(start);
        if (list.size() > k) {
            return;
        }
        if (list.size() == k && n - start == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i < 10 &&  n - i > 0; i++) {
            dfs(i + 1, n - i, k, list, res);
            list.remove(list.size()-1);
        }
    }


    public static void main(String[] args) {
        System.out.println(new CombinationSum3().combinationSum3(3, 9));
        System.out.println(new CombinationSum3().combinationSum3(3, 7));
    }
}
