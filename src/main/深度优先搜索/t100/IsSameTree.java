package 深度优先搜索.t100;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/11/05 21:36
 */
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return  isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t11 = new TreeNode(1);
        TreeNode t12 = new TreeNode(1);
        TreeNode t13 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t21 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);

//        t1.left = 链表.t2;
//        t1.right = t3;
//        System.out.println(new IsSameTree().isSameTree(t1, t1));


//        t1.left = 链表.t2;
//        t1.right = t11;
//        t12.left = t13;
//        t12.right = t21;
//        System.out.println(new IsSameTree().isSameTree(t1, t12));

        t1.left = t2;
        t11.right = t21;
        System.out.println(new IsSameTree().isSameTree(t1, t11));
    }

}
