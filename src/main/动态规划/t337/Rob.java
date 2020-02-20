package 动态规划.t337;

import 深度优先搜索.TreeNode;

import java.time.temporal.ValueRange;

/**
 * @auther: sotowang
 * @date: 2019/12/12 17:24
 */
public class Rob {
    public int rob1(TreeNode root) {
        int[] res = dfs1(root);
        return Math.max(res[0], res[1]);
    }
    private int[] dfs1(TreeNode root) {
        if (root == null) {
            return new int[2];
        }
        int[] res = new int[2];

        int[] left =dfs(root.left);
        int[] right = dfs(root.right);
        //当前节点不偷 = 左节点 偷/不偷最大值+右节点偷/不偷最大值
        res[0] = Math.max(left[1], left[0]) + Math.max(right[1], right[0]);
        //当前节点偷 = 左节点不偷 + 右节点不偷 + 当前节点
        res[1] = left[0] + right[0] + root.val;
        return res;
    }

    //2020/02/20
    public int rob(TreeNode root) {
        int[] res = dfs(root);
        return res[0] > res[1] ? res[0] : res[1];
    }

    public int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[2];
        }
        //res[0]不偷当前节点
        //res[1]偷当前节点
        int[] res = new int[2];
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        //偷当前节点 = 不偷左+不偷右
        res[1] = left[0] + right[0] + root.val;
        //不偷当前节点 = 偷左/不偷左+偷右/不偷右
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return res;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(4, new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), null), null);
        assert new Rob().rob(root1) == 7;
        TreeNode root = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(3)), new TreeNode(5, null, new TreeNode(1)));
        assert new Rob().rob(root) == 9;

    }
}
