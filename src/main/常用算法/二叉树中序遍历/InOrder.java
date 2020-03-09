package 常用算法.二叉树中序遍历;

import 深度优先搜索.TreeNode;

import java.util.ArrayDeque;

/**
 * @auther: sotowang
 * @date: 2020/3/9 22:33
 */
public class InOrder {
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                p = stack.pop();
                System.out.print(p.val + ",");
                p = p.right;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
                new TreeNode(3, null, null));
        new InOrder().inOrder(root);

    }
}
