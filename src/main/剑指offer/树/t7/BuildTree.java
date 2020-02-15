package 剑指offer.树.t7;

import 广度优先搜索.TreeNode;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/2/15 20:53
 */
public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int mark = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                mark = i;
                break;
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
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode res = new BuildTree().buildTree(preorder, inorder);
        System.out.println("debug");
    }
}
