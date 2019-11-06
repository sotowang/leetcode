package 深度优先搜索.t104;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/11/06 19:33
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDept = maxDepth(root.left) + 1;
        int rightDept = maxDepth(root.right) + 1;
        return Math.max(leftDept, rightDept);
    }

    public static void main(String[] args) {
        TreeNode t3 = new TreeNode(3);
        TreeNode t9 = new TreeNode(9);
        TreeNode t20 = new TreeNode(20);
        TreeNode t15 = new TreeNode(15);
        TreeNode t7 = new TreeNode(7);
        t3.left = t9;
        t3.right = t20;
        t20.left = t15;
        t20.right = t7;

        System.out.println(new MaxDepth().maxDepth(t3));
    }
}
