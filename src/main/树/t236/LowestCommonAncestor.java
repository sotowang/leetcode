package 树.t236;

import 深度优先搜索.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @auther: sotowang
 * @date: 2019/11/27 19:51
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
        parentMap.put(root, null);
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!parentMap.containsKey(p) || !parentMap.containsKey(q)) {
            TreeNode temp = stack.pop();
            if (temp.left != null) {
                stack.push(temp.left);
                parentMap.put(temp.left, temp);
            }
            if (temp.right != null) {
                stack.push(temp.right);
                parentMap.put(temp.right, temp);
            }
        }
        Set<TreeNode> parentSet = new HashSet<>();
        while (p != null) {
            parentSet.add(p);
            p = parentMap.get(p);
        }
        while (!parentSet.contains(q)) {
            q = parentMap.get(q);
        }
        return q;
    }

    public static void main(String[] args) {
        TreeNode t0 = new TreeNode(0);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(8);
        TreeNode t9 = new TreeNode(9);
        t3.left = t5;
        t3.right = t1;
        t5.left = t6;
        t5.right = t2;
        t1.left = t0;
        t1.right = t8;
        t2.left = t7;
        t2.right = t4;
        System.out.println(new LowestCommonAncestor().lowestCommonAncestor(t3, t5, t4).val);
        System.out.println(new LowestCommonAncestor().lowestCommonAncestor(t3, t4, t0).val);
    }
}
