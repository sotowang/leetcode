package 树.公共祖先.面试题04_08;

import 广度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2020/3/26 21:51
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null  || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left != null && right != null){
            return root;
        }else if(left != null){
            return left;
        }else{
            return right;
        }
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(3);
        TreeNode q = new TreeNode(4);
        p.left = q;
        TreeNode root = new TreeNode(1, new TreeNode(2, p, null), null);
        new LowestCommonAncestor().lowestCommonAncestor(root, p, q);
    }
}
