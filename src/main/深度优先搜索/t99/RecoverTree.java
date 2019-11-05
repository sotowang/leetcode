package 深度优先搜索.t99;


import 深度优先搜索.TreeNode;

import java.util.Stack;

/**
 * @auther: sotowang
 * @date: 2019/11/05 14:55
 */
public class RecoverTree {
    public void recoverTree(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        TreeNode pre = new TreeNode(Integer.MIN_VALUE);
        TreeNode firstVal = null;
        TreeNode secondVal = null;

        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if (firstVal == null && pre.val > p.val) {
                firstVal = pre;
            }
            if (firstVal != null && pre.val > p.val) {
                secondVal = p;
            }
            pre = p;
            p = p.right;
        }
        int temp = firstVal.val;
        firstVal.val = secondVal.val;
        secondVal.val = temp;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);

        t1.left = t3;
        t3.right = t2;
        new RecoverTree().recoverTree(t1);


    }
}
