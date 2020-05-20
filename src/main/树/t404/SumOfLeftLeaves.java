package 树.t404;

import 广度优先搜索.TreeNode;

/**
 * @author: wangsongtao
 * @date: 2020/05/20 20:48
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left != null && root.left.left == null && root.left.right == null){
            return  root.left.val + sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
