package 设计.t707;

/**
 * @auther: sotowang
 * @date: 2020/01/16 16:51
 */
public class MyLinkedList {
    class ListNode{
        private int val;
        private ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private ListNode head;
    private ListNode rear;
    private int len;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new ListNode(-1, null);
        rear = head;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (index >= len) {
            return -1;
        }
        ListNode cur = head;
        while (index-- >= 0) {
            cur = cur.next;
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        head.next = new ListNode(val, head.next);
        if (rear == head) {
            rear = rear.next;
        }
        len++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        rear.next = new ListNode(val, rear.next);
        rear = rear.next;
        len++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if (index > len) {
            return;
        } else if (index < 0) {
            addAtHead(val);
        } else if (index == len) {
            addAtTail(val);
        } else {
            ListNode cur = head;
            while (index-- > 0) {
                cur = cur.next;
            }
            cur.next = new ListNode(val, cur.next);
            len++;
        }
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index >= len || index < 0) {
            return;
        }
        ListNode cur = head;
        int temp = index;
        while (temp-- > 0) {
            cur = cur.next;
        }
        if (index == len - 1) {
            cur.next = null;
            rear = cur;
        } else {
            cur.next = cur.next.next;
        }
        len--;
    }

    public static void main(String[] args) {
        /**
         *
         * ["MyLinkedList","addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtTail","get","deleteAtIndex","deleteAtIndex"]
         * [[],[2],[1],[2],[7],[3],[2],[5],[5],[5],[6],[4]]
         *
         * ["MyLinkedList","addAtHead","get","addAtHead","addAtHead","deleteAtIndex","addAtHead","get","get","get","addAtHead","deleteAtIndex"]
         * [[],[4],[1],[1],[5],[3],[7],[3],[3],[3],[1],[4]]
         *
         * ["MyLinkedList","addAtHead","addAtIndex","get","addAtHead","addAtTail","get","addAtTail","get","addAtHead","get","addAtHead"]
         * [[],[5],[1,2],[1],[6],[2],[3],[1],[5],[2],[2],[6]]
         */

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(5);
        linkedList.addAtIndex(1,2);
        linkedList.get(1);
        linkedList.addAtHead(6);
        linkedList.addAtTail(2);
        linkedList.get(3);
        linkedList.addAtTail(1);
        linkedList.get(5);
        linkedList.addAtHead(2);
        linkedList.get(2);
        linkedList.addAtHead(6);


    }
}
