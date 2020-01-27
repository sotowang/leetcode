package 堆.t692;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/1/27 22:15
 */
public class TopKFrequent {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> freMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            freMap.put(words[i], freMap.getOrDefault(words[i], 0) + 1);
        }
        PriorityQueue<String> minHeap = new PriorityQueue<>(k, new Comparator<String>() {
            @Override
            //-1不调顺序
            //+1调顺序
            public int compare(String a, String b) {
                int res = freMap.get(a) - freMap.get(b);
                if ( res < 0) {
                    return -1;
                } else if (res == 0) {
                    return b.compareTo(a);
                }
                return 1;
            }
        });
        for (Map.Entry<String, Integer> entry : freMap.entrySet()
        ) {
            if (minHeap.size() < k) {
                minHeap.offer(entry.getKey());
            } else {
                //若频率相同情况下，需要替换为字母靠前的单词
                if (freMap.get(minHeap.peek()) < entry.getValue()
                        || (freMap.get(minHeap.peek()) == entry.getValue()
                        && minHeap.peek().compareTo(entry.getKey()) > 0)
                ) {
                    minHeap.poll();
                    minHeap.offer(entry.getKey());
                }
            }
        }
        List<String> res = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            res.add(0,minHeap.poll());
        }
        return res;
    }

    public static void main(String[] args) {
        //["i","love","coding"]
        String[] s3 = {"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(new TopKFrequent().topKFrequent(s3, 3));
        //[i]
        String[] s2 = {"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(new TopKFrequent().topKFrequent(s2, 1));

        //[the, is, sunny, day]
        String[] s1 = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        System.out.println(new TopKFrequent().topKFrequent(s1, 4));

        //[i, love]
        String[] s = {"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(new TopKFrequent().topKFrequent(s, 2));

    }
}
