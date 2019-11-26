package 树.t145;

import 深度优先搜索.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/11/26 20:10
 */
public class PostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        HashMap<TreeNode, Boolean> visitedMap = new HashMap<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.peek();
            if (p.right != null && !visitedMap.getOrDefault(p.right, false)) {
                p = p.right;
            } else if (p.right == null || visitedMap.getOrDefault(p.right,false)) {
                p = stack.pop();
                res.add(p.val);
                visitedMap.put(p, true);
                p = null;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.right = t2;
        t2.left = t3;
        System.out.println(new PostorderTraversal().postorderTraversal(t1));
    }
}
