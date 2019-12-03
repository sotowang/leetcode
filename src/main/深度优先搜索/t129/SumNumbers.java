package 深度优先搜索.t129;

import 深度优先搜索.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/11/12 18:02
 */
public class SumNumbers {
    private List<Integer> res = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        calculate(root, new ArrayList<Integer>());
        int sum = 0;
        for (int n : res
        ) {
            sum += n;
        }
        return sum;
    }

    private void calculate(TreeNode root, List<Integer> temp) {
        if (root == null) {
            return ;
        }
        temp.add(root.val);
        if (root.left == null && root.right == null) {
            int sum = 0;
            for (int n : temp
            ) {
                sum = sum * 10 + n;
            }
            res.add(sum);
        }
        calculate(root.left, temp);
        calculate(root.right, temp);
        temp.remove(temp.size() - 1);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;

        System.out.println(new SumNumbers().sumNumbers(t1));
//        TreeNode t0 = new TreeNode(0);
//        TreeNode 数组.t1 = new TreeNode(1);
//        TreeNode 二分查找.t4 = new TreeNode(4);
//        TreeNode t5 = new TreeNode(5);
//        TreeNode t9 = new TreeNode(9);
//        二分查找.t4.left = t9;
//        二分查找.t4.right = t0;
//        t9.left = t5;
//        t9.right = 数组.t1;
//
//        System.out.println(new SumNumbers().sumNumbers(二分查找.t4));
    }
}
