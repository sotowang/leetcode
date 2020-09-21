package 树.t538;

import 广度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2020/01/10 19:31
 */
public class ConvertBST {
    private int pre;
    public TreeNode convertBST(TreeNode root) {
        if(root == null){
            return null;
        }
        convertBST(root.right);
        root.val += pre;
        pre = root.val;
        convertBST(root.left);
        return root;
    }

    public static void main(String[] args) {
        TreeNode t2 = new TreeNode(2);
        TreeNode t0 = new TreeNode(0);
        TreeNode t3 = new TreeNode(3);
        TreeNode t_4 = new TreeNode(-4);
        TreeNode t1 = new TreeNode(1);
        t2.left = t0;
        t2.right = t3;
        t0.left = t_4;
        t0.right = t1;
        TreeNode res = new ConvertBST().convertBST(t2);

    }
}
