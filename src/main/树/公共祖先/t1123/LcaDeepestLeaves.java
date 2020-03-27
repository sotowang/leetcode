package 树.公共祖先.t1123;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/12/26 21:51
 */
public class LcaDeepestLeaves {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if (root == null) {
            return null;
        }
        //后序遍历
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (left == right) {
            return root;
        } else if (left > right) {
            return lcaDeepestLeaves(root.left);
        } else {
            return lcaDeepestLeaves(root.right);
        }
    }

    /**
     * 二叉树深度
     * @param root
     * @return
     */
    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left) + 1;
        int right = dfs(root.right) + 1;
        return Math.max(left, right);
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
