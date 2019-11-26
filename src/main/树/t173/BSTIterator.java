package 树.t173;

import 深度优先搜索.TreeNode;
import 链表.t61.RotateRight;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2019/11/26 20:35
 */
public class BSTIterator {
    LinkedList<TreeNode> stack = new LinkedList<>();

    public BSTIterator(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        TreeNode p = stack.pop();
        int val = p.val;
        p = p.right;
        while (p != null) {
            stack.push(p);
            p = p.left;
        }
        return val;
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public static void main(String[] args) {
        TreeNode t3 = new TreeNode(3);
        TreeNode t7 = new TreeNode(7);
        TreeNode t9 = new TreeNode(9);
        TreeNode t15 = new TreeNode(15);
        TreeNode t20 = new TreeNode(20);
        t7.left = t3;
        t7.right = t15;
        t15.left = t9;
        t15.right = t20;

        BSTIterator iterator = new BSTIterator(t7);
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

    }
}
