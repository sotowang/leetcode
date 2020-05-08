package 树.t590;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/05/07 17:29
 */
public class Postorder {
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
    private List<Integer> res = new ArrayList();
    public List<Integer> postorder(Node root) {
        if(root==null){
            return res;
        }
        for(Node node:root.children){
            postorder(node);
        }
        res.add(root.val);
        return res;
    }
}
