package 树.二叉搜索树.t1038;

import 广度优先搜索.TreeNode;

/**
 * @author: sotowang
 * @date: 2020/09/21 15:33
 */
public class BstToGst {
    int pre;
    public TreeNode bstToGst(TreeNode root) {
        if(root == null){
            return null;
        }
        bstToGst(root.right);
        root.val += pre;
        pre = root.val;
        bstToGst(root.left);
        return root;
    }
}
