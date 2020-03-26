package 常用算法.LRU;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @auther: sotowang
 * @date: 2020/3/25 15:55
 */
public class LRUEXample<K, V> extends LinkedHashMap<K, V> {
    private final int MAX_CACHE_SIZE;

    public LRUEXample(int cacheSize) {
        this.MAX_CACHE_SIZE = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > MAX_CACHE_SIZE;
    }

    public static void main(String[] args) {
        LRUEXample<Integer,Integer> lru = new LRUEXample<Integer, Integer>(3);
        lru.put(1, 1);
        lru.put(2, 2);
        lru.put(3, 3);
        lru.put(4, 4);
        for (Map.Entry<Integer, Integer> entry :
                lru.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
