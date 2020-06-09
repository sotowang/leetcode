package 深度优先搜索.t1315;

import 广度优先搜索.TreeNode;

/**
 * @author: wangsongtao
 * @date: 2020/06/09 20:36
 */
public class SumEvenGrandparent {
    public int sumEvenGrandparent(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if ((root.val & 1) == 0) {
            if (root.left != null) {
                if (root.left.left != null) {

                    sum += root.left.left.val;
                }
                if (root.left.right != null) {
                    sum += root.left.right.val;
                }
            }
            if (root.right != null) {
                if (root.right.left != null) {
                    sum += root.right.left.val;
                }
                if (root.right.right != null) {
                    sum += root.right.right.val;
                }
            }
        }
        return sum + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
    }
}
