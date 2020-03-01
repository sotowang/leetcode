package 树.t513;

import 广度优先搜索.TreeNode;

import java.util.ArrayDeque;

/**
 * @auther: sotowang
 * @date: 2020/3/1 19:08
 */
public class FindBottomLeftValue {
    public int findBottomLeftValue(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            //由右向左
            if (root.right != null) {
                queue.offer(root.right);
            }
            if (root.left != null) {
                queue.offer(root.left);
            }
        }
        return root.val;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assert new FindBottomLeftValue().findBottomLeftValue(root) == 1;

    }
}
