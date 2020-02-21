package 回溯算法.t77;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/2/21 21:58
 */
public class Combine2 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k > n || k < 0) {
            return res;
        }
        backTrace(n, k, 1, new ArrayList<>(), res);
        return res;
    }

    private void backTrace(int n, int k, int start, List<Integer> tem, List<List<Integer>> res) {
        if (tem.size() == k) {
            res.add(new ArrayList<>(tem));
            return;
        }
        for (int i = start; i <= n - (k - tem.size()) + 1; i++) {
            tem.add(i);
            backTrace(n, k, i + 1, tem, res);
            tem.remove(tem.size() - 1);
        }
    }


    public static void main(String[] args) {
        System.out.println(new Combine2().combine(4, 2));
        System.out.println(new Combine().combine(5, 3));


    }
}
