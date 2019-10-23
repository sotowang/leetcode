package 链表.t138;

/**
 * @auther: wangsongtao_sx
 * @date: 2019/10/22 21:20
 */
public class CopyRandomList {
    static class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {}

        public Node(int _val,Node _next,Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Node cur = head;
        while (cur != null) {
            //新建一个节点,节点next指向cur的next
            Node cpNode = new Node(cur.val, cur.next, null);
            cur.next = cpNode;
            cur = cur.next.next;
        }
        cur = head;

        while (cur != null) {
            cur.next.random = cur.random == null ? null : cur.random.next;
            cur = cur.next.next;
        }
        Node curcp = head.next;
        Node cphead = head.next;

        cur = head;
        while (cur != null) {
            cur.next = cur.next.next;
            curcp.next = curcp.next != null ? curcp.next.next : null;
            curcp = curcp.next;
            cur = cur.next;
        }
        return cphead;
    }

    public static void main(String[] args) {
        Node l1 = new Node();
        Node l2 = new Node();
        l1.random = l2;
        l1.val = 1;
        l2.val = 2;
        l1.next = l2;
        l2.random = l2;
        l2.next = null;

        Node l_1 = new Node();
        l_1.val = -1;
        Node res = new CopyRandomList().copyRandomList(l1);
//        Node res = new CopyRandomList().copyRandomList(l_1);

    }


}
