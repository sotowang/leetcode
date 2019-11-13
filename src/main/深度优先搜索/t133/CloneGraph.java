package 深度优先搜索.t133;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2019/11/12 21:16
 */
public class CloneGraph {
    private Map<Integer, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        if (map.containsKey(node.hashCode())) {
            return map.get(node.hashCode());
        }
        Node cloneNode = new Node(node.val, null);
        map.put(node.hashCode(), cloneNode);
        if (node.neighbors != null) {
            cloneNode.neighbors = new ArrayList<>();
            for (Node neighbor :
                    node.neighbors) {
                cloneNode.neighbors.add(cloneGraph(neighbor));
            }
        }
        return cloneNode;
    }

    public static void main(String[] args) {
        Node n4 = new Node();
        Node n3 = new Node();
        Node n2 = new Node();
        Node n1 = new Node();
        n1.val = 1;
        n2.val = 2;
        n3.val = 3;
        n4.val = 4;
        n1.neighbors = new ArrayList<>(Arrays.asList(n2, n4));
        n2.neighbors = new ArrayList<>(Arrays.asList(n1, n3));
        n3.neighbors = new ArrayList<>(Arrays.asList(n2, n4));
        n4.neighbors = new ArrayList<>(Arrays.asList(n1, n3));

        Node res = new CloneGraph().cloneGraph(n1);

    }
}
