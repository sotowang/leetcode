package 树.层次遍历.t637;

import 广度优先搜索.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: sotowang
 * @date: 2020/09/12 17:18
 */
public class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> resList = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            long sum = 0;
            for(int i=0;i<size;i++){
                TreeNode p = queue.poll();
                sum += p.val;
                if(p.left != null){
                    queue.offer(p.left);
                }
                if(p.right != null){
                    queue.offer(p.right);
                }
            }
            resList.add((double) sum /(double) size);
        }
        return resList;
    }
}
