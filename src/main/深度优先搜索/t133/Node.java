package 深度优先搜索.t133;

import java.util.List;

/**
 * @auther: sotowang
 * @date: 2019/11/12 21:17
 */
public class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
