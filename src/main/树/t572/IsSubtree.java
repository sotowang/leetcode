package 树.t572;

import 广度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2020/05/07 14:59
 */
public class IsSubtree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s== null && t == null){
            return true;
        }
        if(s == null){
            return false;
        }
        if(s.val == t.val){
            if(isSameTree(s.left,t.left) && isSameTree(s.right,t.right)){
                return true;
            }
        }
        boolean flag1 = isSubtree(s.left,t);
        boolean flag2 = isSubtree(s.right,t);
        return flag1 || flag2;
    }
    private boolean isSameTree(TreeNode s,TreeNode t){
        if(s == null && t== null){
            return true;
        }
        if(s == null || t== null){
            return false;
        }
        return s.val == t.val && isSameTree(s.left,t.left) && isSameTree(s.right,t.right);
    }
}
