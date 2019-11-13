package 广度优先搜索.t199;

import 深度优先搜索.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @auther: sotowang
 * @date: 2019/11/13 20:34
 */
public class RightSideView {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            if (root == null) {
                return res;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    if (i == size - 1) {
                        res.add(queue.peek().val);
                    }
                    TreeNode p = queue.remove();
                    if (p.left != null) {
                        queue.offer(p.left);
                    }
                    if (p.right != null) {
                        queue.offer(p.right);
                    }
                }
            }
            return res;
        }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.right = t5;
        t3.right = t4;

        List<Integer> res = new RightSideView().rightSideView(t1);

        for (int i :
                res) {
            System.out.println(i+"  ");
        }
    }
}
