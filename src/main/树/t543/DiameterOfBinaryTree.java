package 树.t543;

import 广度优先搜索.TreeNode;
import 数组.t152.MaxProduct;

/**
 * @auther: sotowang
 * @date: 2020/01/10 21:56
 */
public class DiameterOfBinaryTree {
    private int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        depth(root);
        return res;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left);
        int right = depth((root.right));
        res = Math.max(left + right, res);
        return Math.max(left, right)+1;
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
        System.out.println(new DiameterOfBinaryTree().diameterOfBinaryTree(t1));
    }
}
