package 树.树转链表.面试题36;

/**
 * @auther: sotowang
 * @date: 2020/4/7 22:29
 */
public class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}
