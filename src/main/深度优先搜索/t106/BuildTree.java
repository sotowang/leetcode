package 深度优先搜索.t106;

import 深度优先搜索.TreeNode;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/11/06 20:15
 */
public class BuildTree {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0 || postorder.length == 0) {
            return null;
        }
        int len = postorder.length;
        TreeNode root = new TreeNode(postorder[len - 1]);
        int mark = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (root.val == inorder[i]) {
                mark = i;
            }
        }

        int[] postLeft = Arrays.copyOfRange(postorder, 0, mark);
        int[] postRight = Arrays.copyOfRange(postorder, mark, len-1);

        int[] inLeft = Arrays.copyOfRange(inorder, 0, mark);
        int[] inRight = Arrays.copyOfRange(inorder, mark + 1, inorder.length);

        root.left = buildTree(inLeft, postLeft);
        root.right = buildTree(inRight, postRight);
        return root;
    }

    public static void main(String[] args) {
        int[] inOrder = new int[]{9, 3, 15, 20, 7};
        int[] postOrder = new int[]{9, 15, 7, 20, 3};
        TreeNode root = new BuildTree().buildTree(inOrder, postOrder);

    }
}
