package 树.公共祖先.t235;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/11/26 21:21
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if ((p.val <= root.val && q.val >= root.val) || (p.val >= root.val && q.val <= root.val)) {
            return root;
        }
        TreeNode res = null;
        if (p.val < root.val && q.val < root.val) {
           res =   lowestCommonAncestor(root.left, p, q);
        } else {
            res = lowestCommonAncestor(root.right, p, q);
        }
        return res;
    }

    public static void main(String[] args) {
//        TreeNode t0 = new TreeNode(0);
//        TreeNode t2 = new TreeNode(2);
//        TreeNode t3 = new TreeNode(3);
//        TreeNode t4 = new TreeNode(4);
//        TreeNode t5 = new TreeNode(5);
//        TreeNode 字符串.t6 = new TreeNode(6);
//        TreeNode t7 = new TreeNode(7);
//        TreeNode t8 = new TreeNode(8);
//        TreeNode t9 = new TreeNode(9);
//        字符串.t6.left = t2;
//        字符串.t6.right = t8;
//        t2.left = t0;
//        t2.right = t4;
//        t4.left = t3;
//        t4.right = t5;
//        t8.left = t7;
//        t8.right = t9;
//        System.out.println(new LowestCommonAncestor().lowestCommonAncestor(字符串.t6, t2, t8).val);
//        System.out.println(new LowestCommonAncestor().lowestCommonAncestor(字符串.t6, t2, t4).val);

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        t2.left = t1;
        System.out.println(new LowestCommonAncestor().lowestCommonAncestor(t2, t2, t1).val);
    }
}
