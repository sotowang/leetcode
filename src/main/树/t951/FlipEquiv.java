package 树.t951;

import 广度优先搜索.TreeNode;

/**
 * @author: wangsongtao
 * @date: 2020/05/20 09:32
 */
public class FlipEquiv {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1 == null  && root2 == null){
            return true;
        }else if(root1 == null || root2 == null){
            return false;
        }
        if(root1.val == root2.val){
            return (flipEquiv(root1.left,root2.left) && flipEquiv(root1.right,root2.right)) || (flipEquiv(root1.left,root2.right) && flipEquiv(root1.right,root2.left));
        }else{
            return false;
        }

    }
}
