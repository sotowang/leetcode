package 树.面试题32_III;

import 广度优先搜索.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: wangsongtao
 * @date: 2020/05/25 20:53
 */
public class levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return Collections.EMPTY_LIST;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> res = new LinkedList<>();
        ArrayList<Integer> temList = new ArrayList<>();
        while(!queue.isEmpty() || !stack.isEmpty()){
            if(!queue.isEmpty()){
                int size = queue.size();
                temList.clear();
                for(int i=0;i<size;i++){
                    TreeNode p = queue.poll();
                    temList.add(p.val);
                    if(p.left != null){
                        stack.push(p.left);
                    }
                    if(p.right != null){
                        stack.push(p.right);
                    }
                }
                res.add(new ArrayList<>(temList));

            }else{
                int size = stack.size();
                temList.clear();
                for(int i=0;i<size;i++){
                    TreeNode p = stack.pop();
                    temList.add(p.val);
                    if(p.right != null){
                        queue.offerFirst(p.right);
                    }
                    if(p.left != null){
                        queue.offerFirst(p.left);
                    }

                }
                res.add(new ArrayList<>(temList));

            }
        }
        return res;

    }
}
