package 树.面试题28;

import 广度优先搜索.TreeNode;

/**
 * @author: wangsongtao
 * @date: 2020/05/15 19:52
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);

    }
    private boolean check(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null || p.val != q.val){
            return false;
        }
        return check(p.left,q.right) && check(p.right,q.left);
    }

}
