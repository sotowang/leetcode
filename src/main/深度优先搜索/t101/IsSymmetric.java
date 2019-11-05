package 深度优先搜索.t101;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/11/05 21:55
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    public boolean isMirror(TreeNode p1, TreeNode p2) {
        if (p1 == null && p2 == null) {
            return true;
        }
        if (p1 == null || p2 == null) {
            return false;
        }
        return p1.val == p2.val &&  isMirror(p1.left, p2.right) && isMirror(p1.right, p2.left);
    }

}
