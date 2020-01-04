package 堆.t347;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/1/4 20:53
 */
public class TopKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k > nums.length) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList,(a,b)->(b.getValue()-a.getValue()));

        //小根堆求最大值
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for (int i = 0; i < k; i++) {
            minHeap.offer(entryList.get(i).getKey());
        }
        for (int i = k; i < entryList.size(); i++) {
            //检查是否比堆顶元素小
            //若比堆顶小，丢掉
            //若比堆顶大，弹出堆顶
            if (map.get(minHeap.peek()) < entryList.get(i).getValue()) {
                minHeap.poll();
                minHeap.offer(entryList.get(i).getKey());
            }
        }
        minHeap.stream().forEach(e -> res.add(e));
        return res;
    }

    public static void main(String[] args) {
        int[] nums2 = {4, 1, -1, 2, -1, 2, 3};
        System.out.println(new TopKFrequent().topKFrequent(nums2, 2));
        int[] nums1 = {1};
        System.out.println(new TopKFrequent().topKFrequent(nums1, 1));
        int[] nums = {1, 1, 2, 2, 3};
        System.out.println(new TopKFrequent().topKFrequent(nums, 2));
    }
}
