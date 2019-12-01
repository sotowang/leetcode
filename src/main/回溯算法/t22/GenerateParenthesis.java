package 回溯算法.t22;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/01 16:40
 */
public class GenerateParenthesis {
    private List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return res;
        }
        dfs("", n, n);
        return res;
    }

    private void dfs(String s, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(s);
            return;
        }
        //left不受限制
        if (left > 0) {
            dfs(s + "(", left - 1, right);
        }
        if (right > 0 && right > left) {
            dfs(s + ")", left, right - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new GenerateParenthesis().generateParenthesis(2));
    }
}
