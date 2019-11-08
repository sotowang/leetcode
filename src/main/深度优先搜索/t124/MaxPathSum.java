package 深度优先搜索.t124;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/11/08 21:09
 */
public class MaxPathSum {
    private int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        calculate(root);
        return max;
    }

    public int calculate(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(calculate(root.left), 0);
        int right = Math.max(calculate(root.right), 0);

        int price = root.val + left + right;
        max = Math.max(max, price);
        return root.val + Math.max(left, right);

    }

    public static void main(String[] args) {
        TreeNode t_10 = new TreeNode(-10);
        TreeNode t9 = new TreeNode(9);
        TreeNode t20 = new TreeNode(20);
        TreeNode t15 = new TreeNode(15);
        TreeNode t7 = new TreeNode(7);
        t_10.left = t9;
        t_10.right = t20;
        t20.left = t15;
        t20.right = t7;
        System.out.println(new MaxPathSum().maxPathSum(t_10));
    }
}
