package 深度优先搜索.t111;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/11/06 21:10
 */
public class MinDepth {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMin = 1 + minDepth(root.left);
        int rightMin = 1 + minDepth(root.right);
        //[1,2] 这种情况时,正确结果应该为2而不是1
        if (root.left == null) {
            return rightMin;
        }
        if (root.right == null) {
            return leftMin;
        }
        return Math.min(leftMin, rightMin);
    }

    public static void main(String[] args) {
        TreeNode t3 = new TreeNode(3);
        TreeNode t9 = new TreeNode(9);
        TreeNode t20 = new TreeNode(20);
        TreeNode t15 = new TreeNode(15);
        TreeNode t7 = new TreeNode(7);
        t3.left = t9;
        t3.right = t20;
        t20.left = t15;
        t20.right = t7;

        System.out.println(new MinDepth().minDepth(t3));
    }
}
