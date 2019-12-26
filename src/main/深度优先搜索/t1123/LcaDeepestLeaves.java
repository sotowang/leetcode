package 深度优先搜索.t1123;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/12/26 21:51
 */
public class LcaDeepestLeaves {
    private TreeNode parent;

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        dfs(root, 0);
        return parent;
    }

    private int dfs(TreeNode root, int dept) {
        if (root == null) {
            return 0;
        }
        int left = 1 + dfs(root.left);
        int right = 1 + dfs(root.right);
        if (left == right) {
            return root;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        System.out.println(new LcaDeepestLeaves().lcaDeepestLeaves(t1).val);
    }
}
