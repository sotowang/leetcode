package 树.t1302;

import 广度优先搜索.TreeNode;

import java.util.ArrayDeque;

/**
 * @auther: sotowang
 * @date: 2020/4/12 13:16
 */
public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        int sum=root.val;
        while(!queue.isEmpty()){
            int size = queue.size();
            TreeNode cur;
            sum = 0;
            for(int i=0;i<size;i++){
                cur = queue.poll();
                sum += cur.val;
                if(cur.left!=null ){
                    queue.offer(cur.left);
                }
                if(cur.right!= null){
                    queue.offer(cur.right);
                }
            }
        }
        return sum;
    }
}
