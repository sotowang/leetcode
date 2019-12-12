package 其他.t437;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/12/11 17:45
 */
public class PathSum {
    private int count;

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        dfs(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return count;
    }

    private void dfs(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        sum -= root.val;
        if (sum == 0) {
            count++;
        }
        dfs(root.left, sum);
        dfs(root.right, sum);
    }

    public static void main(String[] args) {
        TreeNode t10 = new TreeNode(10);
        TreeNode t5 = new TreeNode(5);
        TreeNode t_3 = new TreeNode(-3);
        TreeNode t3_1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2);
        TreeNode t11 = new TreeNode(11);
        TreeNode t3_2 = new TreeNode(3);
        TreeNode t_2 = new TreeNode(2);
        TreeNode t1 = new TreeNode(1);
        t10.left = t5;
        t10.right = t_3;
        t5.left = t3_1;
        t5.right = t2;
        t_3.right = t11;
        t3_1.left = t3_2;
        t3_1.right = t_2;
        t2.right = t1;

        System.out.println(new PathSum().pathSum(t10, 8));
    }
}
