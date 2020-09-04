package 常用算法.其它.腾讯;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: sotowang
 * @date: 2020/09/03 15:07
 */
public class Example6 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static List<Integer> inOrder(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        if (root == null) {
            return resList;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            if (!stack.isEmpty()) {
                p = stack.pop();
                resList.add(p.val);
                p = p.right;
            }
        }
        return resList;
    }

    public static void main(String[] args) {
        //     1
        //  2    3
        //4   5

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        System.out.println(inOrder(t1));


    }
}
