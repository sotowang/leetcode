package 树.t1008;

import 广度优先搜索.TreeNode;

/**
 * @auther: sotowang
 * @date: 2020/05/17 16:50
 */
public class BstFromPreorder {
    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder,0,preorder.length-1);
    }
    public TreeNode build(int[] preorder,int start,int end){
        if(start>end){
            return null;
        }
        TreeNode root = new TreeNode(preorder[start]);
        int index = start+1;
        while(index<=end && preorder[index]<preorder[start]){
            index++;
        }
        TreeNode left = build(preorder,start+1,index-1);
        TreeNode right = build(preorder,index,end);
        root.left = left;
        root.right = right;
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {4, 2};
        TreeNode root = new BstFromPreorder().bstFromPreorder(preorder);
        System.out.println();
    }
}
