package 深度优先搜索.t117;

import 深度优先搜索.Node;

/**
 * @auther: sotowang
 * @date: 2019/11/07 21:25
 */
public class Connect {
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node left = root.left;
        Node right = root.right;
        while (left != null) {
            //在分支内遍历时,每二次可能被null指针覆盖
            if (left.next == null) {
                left.next = right;
            }
            left = left.right == null ? left.left : left.right;
            if (right != null) {
                right = right.left == null ? right.right : right.left;
            }
        }
        connect(root.left);
        connect(root.right);
        return root;
    }

    public static void main(String[] args) {
//        Node n7 = new Node(7, null, null, null);
//        Node n6 = new Node(6, null, null, null);
//        Node n5 = new Node(5, null, null, null);
//        Node n4 = new Node(4, null, null, null);
//        Node n3 = new Node(3, null, n7, null);
//        Node n2 = new Node(2, n4, n5, null);
//        Node n1 = new Node(1, n2, n3, null);
//
//        Node root = new Connect().connect(n1);


//        Node n2 = new Node(2, null, null, null);
//        Node n1 = new Node(1, n2, null, null);
//
//        Node root = new Connect().connect(n1);

//        Node n5 = new Node(5, null, null, null);
//        Node n4 = new Node(4, null, null, null);
//        Node n3 = new Node(3, null, n5, null);
//        Node n2 = new Node(2, n4, null, null);
//        Node n1 = new Node(1, n2, n3, null);
//
//        Node root = new Connect().connect(n1);

        Node n8 = new Node(8, null, null, null);
        Node n7 = new Node(7, null, null, null);
        Node n6 = new Node(6, null, n8, null);
        Node n5 = new Node(5, null, null, null);
        Node n4 = new Node(4, n7, null, null);
        Node n3 = new Node(3, null, n6, null);
        Node n2 = new Node(2, n4, n5, null);
        Node n1 = new Node(1, n2, n3, null);

        Node root = new Connect().connect(n1);
    }
}
