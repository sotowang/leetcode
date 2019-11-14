package 回溯算法.t257;

import 深度优先搜索.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/11/14 21:10
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null)
            return res;
        dfs(root, res, new ArrayList<>());
        return res;
   }

    private void dfs(TreeNode root, List<String> res, List list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left == null && root.right == null) {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < list.size() - 1; i++) {
                s.append(list.get(i).toString()).append("->");
            }
            s.append(list.get(list.size() - 1));
            res.add(s.toString());
        }
        dfs(root.left, res, list);
        dfs(root.right, res, list);
        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.right = t5;

        System.out.println(new BinaryTreePaths().binaryTreePaths(t1));
    }
}
