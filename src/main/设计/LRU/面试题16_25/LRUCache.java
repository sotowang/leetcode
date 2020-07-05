package 设计.LRU.面试题16_25;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2020/07/05 23:07
 */
public class LRUCache {
    class Node{
        public int key;
        public int value;
        Node pre;
        Node next;
        public Node(int key,int value){
            this.key = key;
            this.value = value;
        }
    }
    private Node dummyHead;
    private Node dummyTail;
    private Map<Integer,Node> map;
    private int capacity;
    public LRUCache(int capacity) {
        this.map = new HashMap<>(capacity);
        this.capacity = capacity;
        this.dummyHead = new Node(-1,-1);
        this.dummyTail = new Node(-1,-1);
        dummyHead.next = dummyTail;
        dummyTail.pre = dummyHead;
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        moveToTail(node,true);
        return node.value;

    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            moveToTail(map.get(key),true);
            map.get(key).value = value;
            return;
        }
        Node node = new Node(key,value);
        map.put(key,node);
        moveToTail(node,false);
        while(map.size() > capacity){
            map.remove(dummyHead.next.key);
            dummyHead.next = dummyHead.next.next;
            dummyHead.next.pre = dummyHead;
        }
    }
    /**
     *移动到末尾
     **/
    private void moveToTail(Node node, Boolean isExist){
        if(isExist){
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        node.next = dummyTail;
        node.pre = dummyTail.pre;
        dummyTail.pre.next = node;
        dummyTail.pre = node;

    }
}
