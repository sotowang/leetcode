package 树.t1325;

import 广度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2020/1/22 22:37
 */
public class RemoveLeafNodes {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null && target == root.val) {
            return null;
        }
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        if (root.left == null && root.right == null && target == root.val) {
            return null;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2_1 = new TreeNode(2);
        TreeNode t2_2 = new TreeNode(2);
        TreeNode t2_3 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        t1.left = t2_1;
        t2_1.left = t2_2;
        t1.right = t3;
        t3.left = t2_3;
        t3.right = t4;
        TreeNode res = new RemoveLeafNodes().removeLeafNodes(t1, 2);
    }

}
