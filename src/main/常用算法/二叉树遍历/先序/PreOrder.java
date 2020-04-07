package 常用算法.二叉树遍历.先序;

import 常用算法.二叉树遍历.中序.InOrder;
import 深度优先搜索.TreeNode;

import java.util.ArrayDeque;

/**
 * @auther: sotowang
 * @date: 2020/4/7 21:29
 */
public class PreOrder {
    public void preOrder(TreeNode root){
        if (root == null) {
            return;
        }
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while (!stack.isEmpty() || p != null) {
            if (p == null) {
                p = stack.pop();
                p = p.right;
            }else {
                System.out.println(p.val);
                stack.push(p);
                p = p.left;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4, null, null), new TreeNode(5, null, null)),
                new TreeNode(3, null, null));
        new PreOrder().preOrder(root);
    }
}
