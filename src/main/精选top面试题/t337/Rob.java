package 精选top面试题.t337;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/12/12 17:24
 */
public class Rob {

    //    public int rob(TreeNode root) {
//        HashMap<TreeNode, Integer> map = new HashMap<>();
//        return dfs(root, map);
//    }
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

//    private int dfs(TreeNode root, HashMap<TreeNode, Integer> map) {
//        if (root == null) {
//            return 0;
//        }
//        if (map.containsKey(root)) {
//            return map.get(root);
//        }
//        int money = root.val;
//        //偷爷爷节点
//        if (root.left != null) {
//            money += dfs(root.left.left, map) + dfs(root.left.right, map);
//        }
//        if (root.right != null) {
//            money += dfs(root.right.left, map) + dfs(root.right.right, map);
//        }
//        int stole2 = dfs(root.left, map) + dfs(root.right, map);
//        map.put(root, Math.max(money, stole2));
//        return map.get(root);
//    }

    public static void main(String[] args) {
        TreeNode t3_1 = new TreeNode(3);
        TreeNode t3_2 = new TreeNode(3);
        TreeNode t1_1 = new TreeNode(1);
        TreeNode t1_2 = new TreeNode(1);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t3_1.left = t4;
        t3_1.right = t5;
        t4.left = t1_1;
        t4.right = t3_2;
        t5.right = t1_2;
        System.out.println(new Rob().rob(t3_1));
    }
}
