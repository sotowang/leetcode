package 广度优先搜索.t103;

import 广度优先搜索.TreeNode;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2019/11/15 11:16
 */
public class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        boolean direction = true;
        LinkedList<TreeNode> stackOdd = new LinkedList<>();
        LinkedList<TreeNode> stackEven = new LinkedList<>();
        stackOdd.offer(root);
        while (!stackOdd.isEmpty() || !stackEven.isEmpty()) {
            int size = 0;
            if (!stackOdd.isEmpty()) {
                 size = stackOdd.size();
            } else {
                 size = stackEven.size();
            }
            List<Integer> list = new ArrayList();
            for (int i = 0; i < size; i++) {
                TreeNode cur = null;
                if (direction) {
                    cur = stackOdd.pop();
                } else {
                    cur = stackEven.pop();
                }
                list.add(cur.val);
                if (direction) {
                    if (cur.left != null) {
                        stackEven.push(cur.left);
                    }
                    if (cur.right != null) {
                        stackEven.push(cur.right);
                    }
                } else {
                    if (cur.right != null) {
                        stackOdd.push(cur.right);
                    }
                    if (cur.left != null) {
                        stackOdd.push(cur.left);
                    }

                }
                if (i == size - 1) {
                    res.add(new ArrayList<>(list));
                    direction = !direction;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode t3 = new TreeNode(3);
        TreeNode t9 = new TreeNode(9);
        TreeNode t20 = new TreeNode(20);
        TreeNode t15 = new TreeNode(15);
        TreeNode t7 = new TreeNode(7);
        t3.left = t9;
        t3.right = t20;
        t20.left = t15;
        t20.right = t7;

        System.out.println(new ZigzagLevelOrder().zigzagLevelOrder(t3));


//        TreeNode 数组.两数之和类.t1 = new TreeNode(1);
//        TreeNode 链表.t2 = new TreeNode(2);
//        TreeNode t3 = new TreeNode(3);
//        TreeNode 二分查找.t4 = new TreeNode(4);
//        TreeNode t5 = new TreeNode(5);
//        数组.两数之和类.t1.left = 链表.t2;
//        数组.两数之和类.t1.right = t3;
//        链表.t2.left = 二分查找.t4;
//        t3.right = t5;
//        System.out.println(new ZigzagLevelOrder().zigzagLevelOrder(数组.两数之和类.t1));
    }
}
