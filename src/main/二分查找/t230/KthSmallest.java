package 二分查找.t230;

import 深度优先搜索.TreeNode;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2019/11/21 20:58
 */
public class KthSmallest {
    public int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()) {
                k--;
                p = stack.pop();
                if (k == 0) {
                    return p.val;
                }
                p = p.right;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        t3.left = t1;
        t3.right = t4;
        t1.right = t2;

        System.out.println(new KthSmallest().kthSmallest(t3, 1));
        System.out.println(new KthSmallest().kthSmallest(t3, 2));
        System.out.println(new KthSmallest().kthSmallest(t3, 3));
        System.out.println(new KthSmallest().kthSmallest(t3, 4));
    }
}
