package 深度优先搜索.t124;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/11/08 21:09
 */
public class MaxPathSum {
    private int max = 0;
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        max = root.val;
        calMaxSum(root);
        return max;
    }
    public int calMaxSum(TreeNode root){
        if(root == null){
            return 0;
        }
        int left =Math.max(0,calMaxSum(root.left));
        int right = Math.max(0,calMaxSum(root.right));
        max = Math.max(max,left+right+root.val);
        return Math.max(left,right) + root.val;
    }

    public static void main(String[] args) {
        TreeNode t_10 = new TreeNode(-10);
        TreeNode t9 = new TreeNode(9);
        TreeNode t20 = new TreeNode(20);
        TreeNode t15 = new TreeNode(15);
        TreeNode t7 = new TreeNode(7);
        t_10.left = t9;
        t_10.right = t20;
        t20.left = t15;
        t20.right = t7;
        System.out.println(new MaxPathSum().maxPathSum(t_10));
    }
}
