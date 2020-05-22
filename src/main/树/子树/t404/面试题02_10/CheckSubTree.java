package 树.子树.t404.面试题02_10;

import 广度优先搜索.TreeNode;

/**
 * @author: wangsongtao
 * @date: 2020/05/22 20:36
 */
public class CheckSubTree {
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null){
            return true;
        }else if(t1 == null || t2 == null){
            return false;
        }

        if(t1.val == t2.val){
            return (checkSubTree(t1.left,t2.left) && checkSubTree(t1.right,t2.right)) || checkSubTree(t1.left,t2) || checkSubTree(t1.right,t2);
        }else{
            return checkSubTree(t1.left,t2) || checkSubTree(t1.right,t2);
        }
    }
}
