package 回溯算法.t77;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Combine {
    public List<List<Integer>> combine(int n, int k) {
        List result = new ArrayList();
        if (k > n || n < 0 || k < 0) {
            return result;
        }
        getCombine(n, k, 0, new Stack<Integer>(), result);
        return result;
    }

    private void getCombine(int n, int k, int begin, Stack<Integer> path, List result) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        //优化
        for (int i = begin;  i < n-(k-path.size())+1; i++) {
            path.push(i + 1);
            getCombine(n, k, i + 1, path, result);
            path.pop();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Combine().combine(4, 2));
        System.out.println(new Combine().combine(5, 3));
    }

}
