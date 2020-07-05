package 设计.LRU.t146;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: wangsongtao
 * @date: 2020/05/25 20:23
 */
public class LRUCache2 {
    LinkedHashMap<Integer,Integer> linkedHashMap;
    public LRUCache2(int capacity) {
        linkedHashMap = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true){
            @Override
            public boolean removeEldestEntry(Map.Entry<Integer,Integer> entry) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return  linkedHashMap.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        linkedHashMap.put(key, value);
    }

    public static void main(String[] args) {
        LRUCache2 cache = new LRUCache2( 2 /* 缓存容量 */ );

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        System.out.println(cache.get(2));
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
