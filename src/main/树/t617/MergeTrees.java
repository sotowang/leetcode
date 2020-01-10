package 树.t617;

import 广度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2020/01/10 17:00
 */
public class MergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        } else if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t5 = new TreeNode(5);
        t1.left = t3;
        t1.right = t2;
        t3.left = t5;

        TreeNode t2_1 = new TreeNode(1);
        TreeNode t2_2 = new TreeNode(2);
        TreeNode t2_3 = new TreeNode(3);
        TreeNode t2_4 = new TreeNode(4);
        TreeNode t2_7 = new TreeNode(7);
        t2_2.left = t2_1;
        t2_2.right = t2_3;
        t2_1.right = t2_4;
        t2_3.right = t2_7;

        TreeNode res = new MergeTrees().mergeTrees(t1, t2_2);

    }
}
