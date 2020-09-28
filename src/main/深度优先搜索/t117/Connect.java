package 深度优先搜索.t117;

import 深度优先搜索.Node;

/**
 * @auther: sotowang
 * @date: 2019/11/07 21:25
 */
public class Connect {
    public Node connect(Node root) {
        if(root == null || (root.left == null && root.right == null)){
            return root;
        }
        if(root.left !=null && root.right != null){
            root.left.next = root.right;
        }
        Node lastNode;
        if(root.right != null){
            lastNode = root.right;
        }else{
            lastNode = root.left;
        }
        Node head = root.next;
        while(head != null && (head.left == null && head.right == null)){
            head = head.next;
        }
        if(head != null){
            if(head.left != null){
                lastNode.next = head.left;
            }else{
                lastNode.next = head.right;
            }
        }
        connect(root.right);
        connect(root.left);
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

//        Node n1 = new Node(1, null, null, null);
////
//        Node root = new Connect().connect(n1);
    }
}
