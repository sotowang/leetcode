package 树.二叉搜索树.t530;

import 广度优先搜索.TreeNode;

/**
 * @author: sotowang
 * @date: 2020/10/12 12:21
 */
public class GetMinimumDifference {
    private TreeNode preNode = null;
    private int res = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return res;
    }
    private void dfs(TreeNode root){
        if(root == null){
            return;
        }
        dfs(root.left);
        if(preNode!= null){
            res = Math.min(res,root.val-preNode.val);
        }
        preNode = root;

        dfs(root.right);
    }
}
