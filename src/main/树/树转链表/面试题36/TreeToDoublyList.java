package 树.树转链表.面试题36;

import java.util.ArrayDeque;

/**
 * @auther: sotowang
 * @date: 2020/4/7 22:29
 */
public class TreeToDoublyList {
    public Node treeToDoublyList(Node root) {
        if(root == null){
            return root;
        }
        Node p = root;
        Node q = root;
        Node pre = new Node(-1);
        Node head = root;
        while(head.left!=null){
            head = head.left;
        }
        ArrayDeque<Node> stack = new ArrayDeque<>();
        while(!stack.isEmpty() || p!= null){
            if(p != null){
                stack.push(p);
                p = p.left;
            }else{
                p = stack.pop();
                q = p;
                pre.right = p;
                p.left = pre;
                pre = p;
                p = q.right;
            }
        }
        pre.right = head;
        head.left = pre;
        return head;
    }
}
