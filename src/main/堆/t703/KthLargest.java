package 堆.t703;

import java.util.PriorityQueue;

/**
 * @auther: sotowang
 * @date: 2020/1/27 21:13
 */
public class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int index;

    public KthLargest(int k, int[] nums) {
        minHeap = new PriorityQueue<>(k);
        this.index = k;
        for (int i = 0; i < k && i < nums.length; i++) {
            minHeap.offer(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (nums[i] >= minHeap.peek() && minHeap.size() == k) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
    }

    public int add(int val) {
        if (minHeap.size() >= index) {
            if (val >= minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(val);
            }
        } else {
            minHeap.offer(val);
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {};
        KthLargest kthLargest = new KthLargest(1, nums);
        assert kthLargest.add(-3) == -3;
        assert kthLargest.add(-2) == -2;
        assert kthLargest.add(-4) == -2;
        assert kthLargest.add(0) == 0;
        assert kthLargest.add(4) == 4;

    }

}
