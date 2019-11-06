package 深度优先搜索.t105;

import 深度优先搜索.TreeNode;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2019/11/06 19:40
 */
public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int mark = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root.val) {
                mark = i;
            }
        }

        int[] preLeft = Arrays.copyOfRange(preorder, 1, mark + 1);
        int[] preRight = Arrays.copyOfRange(preorder, mark + 1, preorder.length);

        int[] inLeft = Arrays.copyOfRange(inorder, 0, mark);
        int[] inRight = Arrays.copyOfRange(inorder, mark + 1, inorder.length);

        root.left = buildTree(preLeft, inLeft);
        root.right = buildTree(preRight, inRight);
        return root;
    }

    public static void main(String[] args) {
        int[] preOrder = new int[]{3, 9, 20, 15, 7};
        int[] inOrder = new int[]{9, 3, 15, 20, 7};
        TreeNode root = new BuildTree().buildTree(preOrder, inOrder);
    }
}
