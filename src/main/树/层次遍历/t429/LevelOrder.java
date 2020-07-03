package 树.层次遍历.t429;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: wangsongtao
 * @date: 2020/07/03 19:46
 */
public class LevelOrder {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> resList = new ArrayList<>();
        if(root == null){
            return resList;
        }
        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> temList = new ArrayList<>();
            for(int i=0;i<size;i++){
                Node node = queue.poll();
                temList.add(node.val);
                for(Node child:node.children){
                    queue.offer(child);
                }
            }
            resList.add(temList);
        }
        return resList;
    }
}
