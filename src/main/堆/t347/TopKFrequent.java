package 堆.t347;

import java.util.*;

/**
 * @auther: sotowang
 * @date: 2020/1/4 20:53
 */
public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map= new HashMap<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k,(a,b)->(map.get(a)-map.get(b)));

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(minHeap.size() < k){
                minHeap.offer(entry.getKey());
            }else if(map.get(entry.getKey())>map.get(minHeap.peek())){
                minHeap.poll();
                minHeap.offer(entry.getKey());
            }
        }
        int[] res = new int[k];
        int index = 0;
        while(!minHeap.isEmpty()){
            res[index++] = minHeap.poll();
        }
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
