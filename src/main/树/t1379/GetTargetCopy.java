package 树.t1379;

import 广度优先搜索.TreeNode;

/**
 * @author: wangsongtao
 * @date: 2020/05/26 20:06
 */
public class GetTargetCopy {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null){
            return null;
        }
        if(original.val == target.val){
            return cloned;
        }else{
            TreeNode p1 = getTargetCopy(original.left,cloned.left,target);
            if(p1 != null){
                return p1;
            }else{
                return getTargetCopy(original.right,cloned.right,target);
            }
        }
    }
}
