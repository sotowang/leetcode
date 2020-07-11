package 树.字典序.t386;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/2/27 20:57
 */
public class LexicalOrder {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 9 && i <= n; i++) {
            res.add(i);
            dfs(i, res, n);
        }
        return res;
    }

    private void dfs(int num, List<Integer> res, int target) {
        num *= 10;
        for (int i = 0; i <= 9 && num + i <= target; i++) {
            res.add(num + i);
            dfs(num + i, res, target);
        }
    }

    public static void main(String[] args) {
        System.out.println(new LexicalOrder().lexicalOrder(1));
        System.out.println(new LexicalOrder().lexicalOrder(100));
    }
}
