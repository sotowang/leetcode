package 树.t655;

import 深度优先搜索.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/12/27 20:45
 */
public class PrintTree {
    public List<List<String>> printTree(TreeNode root) {
        int depth = depth(root);
        int width = (int) Math.pow(2, depth) - 1;
        List<List<String>> res = new ArrayList<>(depth);
        for (int i = 0; i < depth; i++) {
            List<String> list = new ArrayList<>(width);
            for (int j = 0; j < width; j++) {
                list.add(j, "");
            }
            res.add(new ArrayList<>(list));
        }
        fillArray(root, res, 0, (int) Math.pow(2, depth) - 1, 0);
        return res;
    }

    private void fillArray(TreeNode root, List<List<String>> res, int left, int right, int dept) {
        if (left > right || root == null) {
            return;
        }
        int mid = left + (right - left) / 2;

        res.get(dept).set(mid, String.valueOf(root.val));
        fillArray(root.left, res, left, mid - 1, dept + 1);
        fillArray(root.right, res, mid + 1, right, dept + 1);
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depth(root.left) + 1;
        int right = depth(root.right)+1;
        return Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        t1.left = t2;
        t1.right = t3;
        t2.right = t4;
        List res = new PrintTree().printTree(t1);
        System.out.println(res);
    }
}
