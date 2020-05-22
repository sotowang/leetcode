package 深度优先搜索.t105;

import 深度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2019/11/06 19:40
 */
public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    private TreeNode build(int[] preorder,int pStart,int pEnd,int[] inorder ,int iStart,int iEnd){
        if(pStart>pEnd || iStart>iEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[pStart]);
        int index = -1;
        for(int i=iStart;i<inorder.length;i++){
            if(inorder[i] == preorder[pStart]){
                index = i;
                break;
            }
        }
        root.left = build(preorder,pStart+1,pStart+index-iStart,inorder,iStart,index);
        root.right =  build(preorder,pStart + index-iStart+1,pEnd,inorder,index+1,iEnd);
        return root;
    }

    public static void main(String[] args) {
        int[] preOrder = new int[]{3, 9, 20, 15, 7};
        int[] inOrder = new int[]{9, 3, 15, 20, 7};
        TreeNode root = new BuildTree().buildTree(preOrder, inOrder);
    }
}
