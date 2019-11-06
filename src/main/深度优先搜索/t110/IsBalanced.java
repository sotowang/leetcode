package 深度优先搜索.t110;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/11/06 20:56
 */
public class IsBalanced {
    private boolean mark = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        depth(root);
        return mark;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = 1 + depth(root.left);
        int right = 1 + depth(root.right);
        if (Math.abs(left - right) > 1) {
            mark = false;
        }
        return left > right ? left : right;
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

        System.out.println(new IsBalanced().isBalanced(t3));
    }

}
