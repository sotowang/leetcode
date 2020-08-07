package 常用算法.LRU;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: sotowang
 * @date: 2020/08/07 16:41
 */
public class LRU {
    class Node{
        private Node pre;
        private Node next;
        private int key;
        private int value;
        public Node(int key,int value) {
            this.key = key;
            this.value = value;
        }
    }
    private int size;
    /**
     * LRU首结点
     */
    private Node dummyHead;
    /**
     * LRU尾结点
     */
    private Node dummyTail;
    /**
     * key 为当前结点的val.
     * value 为当前结点 node
     */
    private Map<Integer,Node> map;

    public LRU(int size) {
        this.size = size;
        this.map = new HashMap<>();
        dummyHead = new Node(-1,-1);
        dummyTail = new Node(-1, -1);
        dummyTail.pre = dummyHead;
        dummyHead.next = dummyTail;
    }

    public void put(int key,int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            moveToTail(true, node);
            return;
        }
        //若是新的值
        Node node = new Node(key, value);
        map.put(key, node);
        moveToTail(false, node);
        while (map.size() > size) {
            map.remove(dummyHead.next.key);
            dummyHead.next = dummyHead.next.next;
            dummyHead.next.pre = dummyHead;
        }
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        moveToTail(true, node);
        return node.value;
    }

    private void moveToTail(boolean isExist, Node node) {
        //若节点已经存在
        if (isExist) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        node.next = dummyTail;
        node.pre = dummyTail.pre;
        dummyTail.pre.next = node;
        dummyTail.pre = node;
    }

    public static void main(String[] args) {
        LRU lru = new LRU(3);
        lru.put(1, 1);
        lru.put(2, 2);
        lru.put(3, 3);
        lru.get(1);
        lru.put(4, 4);


        assert lru.get(2) == -1;
        assert lru.get(1) == 1;
    }
}
