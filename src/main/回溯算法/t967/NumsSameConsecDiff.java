package 回溯算法.t967;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/30 10:15
 */
public class NumsSameConsecDiff {
    public int[] numsSameConsecDiff(int N, int K) {
        List<Integer> res = new ArrayList<>();
        if (N == 1) {
            return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        for (int i = 1; i < 10; i++) {
            dfs(i, i, K, N - 1, res);
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }

    private void dfs(int pre, int val, int k, int N, List<Integer> res) {
        if (N <= 0) {
            res.add(val);
            return;
        }
        for (int i = 0; i <= 9; i++) {
            if (Math.abs(pre - i) == k) {
                int temp = val;
                val = val * 10 + i;
                dfs(i, val, k, N - 1, res);
                val = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] res2 = new NumsSameConsecDiff().numsSameConsecDiff(1, 2);
        Arrays.stream(res2).forEach(e -> System.out.print(e + " "));
        System.out.println();
        int[] res1 = new NumsSameConsecDiff().numsSameConsecDiff(2, 1);
        Arrays.stream(res1).forEach(e -> System.out.print(e + " "));
        System.out.println();
        int[] res = new NumsSameConsecDiff().numsSameConsecDiff(3, 7);
        Arrays.stream(res).forEach(e -> System.out.print(e + " "));

    }
}
