package 树.t993;

import 广度优先搜索.TreeNode;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/05/12 20:25
 */
public class IsCousins {
    public boolean isCousins(TreeNode root, int x, int y) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            TreeNode p1 = null;
            TreeNode p2 = null;
            for(int i=0;i<size;i++){
                TreeNode p = queue.poll();
                if(p.left != null){
                    if(p.left.val == x){
                        p1 = p;
                    }else if(p.left.val == y){
                        p2 = p;
                    }
                    queue.offer(p.left);
                }
                if(p.right != null){
                    if( p.right.val == x){
                        p1 = p;
                    }else if(p.right.val == y){
                        p2 = p;
                    }
                    queue.offer(p.right);
                }
            }
            if(p1 != null && p1==p2){
                return false;
            }else if((p1 != null && p2 != null) && p1!= p2){
                return true;
            }
        }
        return false;
    }




    public static void main(String[] args) {

    }
}
