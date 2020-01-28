package 堆.t451;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @auther: sotowang
 * @date: 2020/1/28 17:45
 */
public class FrequencySort {
    public String frequencySort(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        HashMap<Character, Integer> freMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freMap.put(s.charAt(i), freMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        PriorityQueue<Character> minHeap = new PriorityQueue<>((a, b) -> (freMap.get(b) - freMap.get(a)));

        for (Map.Entry<Character, Integer> entry :
                freMap.entrySet()) {
            minHeap.offer(entry.getKey());
        }
        StringBuilder res = new StringBuilder();
        while (!minHeap.isEmpty()) {
            char c = minHeap.poll();
            for (int i = 0; i < freMap.get(c); i++) {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "";
        System.out.println(new FrequencySort().frequencySort(s));
        assert new FrequencySort().frequencySort("Aabb").equals("bbAa");
        assert new FrequencySort().frequencySort("cccaaa").equals("aaaccc");
        assert new FrequencySort().frequencySort("tree").equals("eert");
    }
}
