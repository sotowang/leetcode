package 深度优先搜索.t1080;

import 广度优先搜索.TreeNode;

import java.util.HashMap;

/**
 * @auther: sotowang
 * @date: 2020/4/24 16:46
 */
public class SufficientSubset {
    private HashMap<TreeNode,Boolean> map = new HashMap();
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        if(root == null ){
            return root;
        }
        dfs(root,limit,0);
        root = delete(root);
        return root;

    }
    private TreeNode delete(TreeNode root){
        if (root == null || !map.get(root)) {
            return null;
        }
        root.left = delete(root.left);
        root.right = delete(root.right);
        return root;
    }
    private boolean dfs(TreeNode root,int limit,int sum){
        if (root.left == null && root.right == null) {
            map.put(root, sum + root.val >= limit);
            return sum + root.val >= limit;
        }
        boolean leftFlag = false;
        boolean rightFlag = false;
        if (root.left != null) {
            leftFlag = dfs(root.left, limit, sum + root.val);
        }
        if (root.right != null) {
            rightFlag = dfs(root.right, limit, sum + root.val);
        }
        boolean flag = leftFlag || rightFlag;
        map.put(root,flag);
        System.out.println(root.val + "," + flag + "/");
        return flag;
    }
    public static void main(String[] args) {
        TreeNode t8 = new TreeNode(8);
        TreeNode t9 = new TreeNode(9);
        TreeNode t_99_1 = new TreeNode(-99);
        TreeNode t_99_2 = new TreeNode(-99);
        TreeNode t12 = new TreeNode(12);
        TreeNode t13 = new TreeNode(13);
        TreeNode t_99_3 = new TreeNode(-99);
        TreeNode t14 = new TreeNode(14);
        TreeNode t4 = new TreeNode(4, t8, t9);
        TreeNode t_99_5 = new TreeNode(-99, t_99_1, t_99_2);
        TreeNode t_99_6 = new TreeNode(-99, t12, t13);
        TreeNode t7 = new TreeNode(7, t_99_3, t14);
        TreeNode t2 = new TreeNode(2, t4, t_99_5);
        TreeNode t3 = new TreeNode(3, t_99_6, t7);
        TreeNode t1 = new TreeNode(1, t2, t3);
        new SufficientSubset().sufficientSubset(t1, 1);
        System.out.println(t1);
//        TreeNode t5 = new TreeNode(5, new TreeNode(-6), new TreeNode(-6));
//        new SufficientSubset().sufficientSubset(t5, 0);
//        System.out.println(t5);

    }
}
