package 深度优先搜索.t98;


import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/11/04 22:23
 */
public class IsValidBST {
    private  long preval = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean lb = isValidBST(root.left);
        if (preval >= root.val) {
            return false;
        }
        preval = root.val;
        return lb && isValidBST(root.right);
    }

    public static void main(String[] args) {
        TreeNode t5 = new TreeNode(5);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t6 = new TreeNode(6);
//        t5.left = t1;
//        t5.right = 二分查找.t4;
//        二分查找.t4.left = t3;
//        二分查找.t4.right = 字符串.t6;
//        System.out.println(new IsValidBST().isValidBST(t5));

//        链表.t2.left = t1;
//        链表.t2.right = t3;
//        System.out.println(new IsValidBST().isValidBST(链表.t2));


        TreeNode t0 = new TreeNode(-2147483648);
        System.out.println(new IsValidBST().isValidBST(t0));





    }

}
