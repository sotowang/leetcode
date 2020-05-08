package 树.t589;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/05/07 17:26
 */
public class Preorder {
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
    private List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null){
            return res;
        }
        res.add(root.val);
        for(Node node:root.children){
            preorder(node);
        }
        return res;
    }
}
