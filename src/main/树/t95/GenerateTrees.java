package 树.t95;

import 深度优先搜索.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/11/25 20:16
 */
public class GenerateTrees {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> res = new LinkedList<>();
        if (n > 0) {
            res = dfs(1, n);
        }
        return res;

    }

    private LinkedList<TreeNode> dfs(int start, int end) {
        LinkedList<TreeNode> res = new LinkedList();
        if (start > end) {
             res.add(null);
            return res;
        }

        for (int i = start; i <= end; i++) {
            LinkedList<TreeNode> leftTrees = dfs(start, i - 1);
            LinkedList<TreeNode> rightTrees = dfs(i + 1, end);
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<TreeNode> res = new GenerateTrees().generateTrees(3);
        for (TreeNode root : res
        ) {
            System.out.println(root.val);
        }
    }
}
