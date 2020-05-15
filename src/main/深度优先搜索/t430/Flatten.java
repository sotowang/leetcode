package 深度优先搜索.t430;

/**
 * @author: wangsongtao
 * @date: 2020/05/15 21:08
 */
public class Flatten {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }
    public Node flatten(Node head) {
        if(head == null){
            return head;
        }
        Node cur = head;
        while(cur != null){
            if(cur.child != null){
                Node next = cur.next;
                Node child = flatten(cur.child);
                cur.next = child;
                child.prev = cur;
                cur.child = null;
                //连接原next
                if(next!=null){
                    while(cur.next != null){
                        cur = cur.next;
                    }
                    cur.next = next;
                    next.prev = cur;
                }
            }
            cur = cur.next;
        }
        return head;
    }
}
