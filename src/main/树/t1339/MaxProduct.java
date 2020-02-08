package 树.t1339;

import 广度优先搜索.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2020/2/8 17:04
 */
public class MaxProduct {
    private long sum = Integer.MIN_VALUE;
    HashMap<TreeNode, Long> sumMap = new HashMap<>();
    public int maxProduct(TreeNode root) {
        if (root == null) {
            return 0;
        }
        long mod = 1000000007;
        if (sum == Integer.MIN_VALUE) {
            sum = dfs(root, sumMap);
        }
        long max = 0;
        for (Map.Entry<TreeNode, Long> entry :
                sumMap.entrySet()) {
            max = Math.max(max, entry.getValue() * (sum - entry.getValue()));
        }
        return (int) ( max % mod);
    }

    private long dfs(TreeNode root, HashMap<TreeNode,Long> sumMap) {
        if (root == null) {
            return 0;
        }
        long left, right;
        if (!sumMap.containsKey(root.left)) {
             left = dfs(root.left,sumMap);
            sumMap.put(root.left, left);
        }
        if (!sumMap.containsKey(root.right)) {
            right = dfs(root.right, sumMap);
            sumMap.put(root.right, right);
        }
        return sumMap.get(root.left) + sumMap.get(root.right) + root.val;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.right = t2;
        t2.left = t3;
        t2.right = t4;
        t4.right = t6;
        t4.left = t5;
        assert new MaxProduct().maxProduct(t1) == 90;
    }
}
