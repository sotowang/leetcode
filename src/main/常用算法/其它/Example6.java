package 常用算法.其它;


import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/29 20:15
 */
public class Example6 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public int rob(TreeNode root) {
        int[] res = dfs(root);
        return Math.max(res[0], res[1]);
    }
    private int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[2];
        }
        int[] res = new int[2];

        int[] left =dfs(root.left);
        int[] right = dfs(root.right);
        //当前节点不偷 = 左节点 偷/不偷最大值+右节点偷/不偷最大值
        res[0] = Math.max(left[1], left[0]) + Math.max(right[1], right[0]);
        //当前节点偷 = 左节点不偷 + 右节点不偷 + 当前节点
        res[1] = left[0] + right[0] + root.val;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int edge = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            TreeNode r = new TreeNode(sc.nextInt());
        }
        for (int i = 0; i < edge; i++) {

        }
    }
}
