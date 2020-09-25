package 深度优先搜索.t106;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/11/06 20:15
 */
public class BuildTree {
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }

    private TreeNode build(int[] inorder,int instart,int inend,int[] postorder,int pstart,int pend){
        if(instart>inend || pstart>pend){
            return null;
        }
        TreeNode root = new TreeNode(postorder[pend]);
        int index = -1;
        for(int i=instart;i<=inend;i++){
            if(root.val == inorder[i]){
                index = i;
                break;
            }
        }
        root.left = build(inorder,instart,index-1,postorder,pstart,pend-(inend-index)-1);
        root.right = build(inorder,index+1,inend,postorder,pend-(inend-index),pend-1);
        return root;
    }

    public static void main(String[] args) {
        int[] inOrder = new int[]{9, 3, 15, 20, 7};
        int[] postOrder = new int[]{9, 15, 7, 20, 3};
        TreeNode root = new BuildTree().buildTree(inOrder, postOrder);

    }
}
