package 回溯算法.t113;

import 深度优先搜索.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/11/06 21:39
 */
public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        pathSum(root, sum, 0, new LinkedList<>(), res);
        return res;
    }

    private void pathSum(TreeNode root, int sum, int temp, LinkedList<Integer> list, List res) {
        if (root == null) {
            return;
        }
        list.offer(root.val);
        temp += root.val;
        if (root.left == null && root.right == null) {
            if (temp == sum) {
                res.add(new ArrayList<>(list));
            }
            list.pollLast();
            return;
        }
        pathSum(root.left, sum, temp, list, res);
        pathSum(root.right, sum, temp, list, res);
        list.pollLast();

    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t4 = new TreeNode(4);
        TreeNode t41 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(8);
        TreeNode t11 = new TreeNode(11);
        TreeNode t13 = new TreeNode(13);

        t5.left = t4;
        t5.right = t8;
        t4.left = t11;
        t8.left = t13;
        t8.right = t41;
        t11.left = t7;
        t11.right = t2;
        t41.right = t1;

        System.out.println(new PathSum().pathSum(t5, 22));
    }
}
