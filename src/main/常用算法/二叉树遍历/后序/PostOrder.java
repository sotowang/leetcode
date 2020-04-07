package 常用算法.二叉树遍历.后序;

import javafx.geometry.Pos;
import 常用算法.二叉树遍历.中序.InOrder;
import 深度优先搜索.TreeNode;

import java.util.ArrayDeque;

/**
 * @auther: sotowang
 * @date: 2020/4/7 21:38
 */
public class PostOrder {
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        TreeNode pre = null;
        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                p = stack.peek();
                if (p.right == null || p.right == pre) {
                    stack.pop();
                    pre = p;
                    System.out.println(p.val);
                    p = null;
                } else {
                    pre = p.right;
                    p = p.right;
                }
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
                new TreeNode(3, null, null));
        new PostOrder().postOrder(root);

    }
}
