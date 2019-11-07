package 深度优先搜索.t114;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/11/07 20:19
 */
public class Flatten {
    private TreeNode preNode = null;
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.right);
        flatten(root.left);

        root.right = preNode;
        root.left = null;
        preNode = root;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        t1.left = t2;
        t1.right = t5;
        t2.left = t3;
        t2.right = t4;
        t5.right = t6;

        new Flatten().flatten(t1);
    }
}
