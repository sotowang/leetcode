package 深度优先搜索.t112;

import 深度优先搜索.TreeNode;

import javax.lang.model.util.TypeKindVisitor7;

/**
 * @auther: sotowang
 * @date: 2019/11/06 21:20
 */
public class HasPathSum {
    boolean res = false;
    public boolean hasPathSum(TreeNode root, int sum) {
        hasPathSum(root, sum, 0);
        return res;
    }

    private void hasPathSum(TreeNode root, int sum, int temp) {
        if (root == null) {
            return;
        }
        temp += root.val;
        //判断是否为叶结点
        if (temp == sum && root.left == null && root.right == null) {
            res = true;
        }

        hasPathSum(root.left, sum, temp);
        hasPathSum(root.right, sum, temp);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t4 = new TreeNode(4);
        TreeNode t41 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(8);
        TreeNode t11 = new TreeNode(11);
        TreeNode t13 = new TreeNode(13);

//        t5.left = 二分查找.t4;
//        t5.right = t8;
//        二分查找.t4.left = t11;
//        t8.left = t13;
//        t8.right = t41;
//        t11.left = t7;
//        t11.right = t2;
//        二分查找.t4.right = t1;
//
//        System.out.println(new HasPathSum().hasPathSum(t5, 22));

        TreeNode t_2 = new TreeNode(-2);
        TreeNode t_3 = new TreeNode(-3);
        t_2.right = t_3;
        System.out.println(new HasPathSum().hasPathSum(t_2, -5));
    }
}
