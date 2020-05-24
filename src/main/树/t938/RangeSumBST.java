package 树.t938;

import 广度优先搜索.TreeNode;

/**
 * @author: wangsongtao
 * @date: 2020/05/24 15:49
 */
public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null){
            return 0;
        }
        if(root.val> R){
            return rangeSumBST(root.left,L,R);
        }else if(root.val <L){
            return rangeSumBST(root.right,L,R);
        }else{
            return root.val + rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R);
        }
    }
}
