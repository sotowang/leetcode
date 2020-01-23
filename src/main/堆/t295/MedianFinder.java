package 堆.t295;

import java.util.PriorityQueue;

/**
 * @auther: sotowang
 * @date: 2020/1/23 23:06
 */
public class MedianFinder {
    /**
     * initialize your data structure here.
     */
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;
    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a, b) -> (b - a));
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (maxHeap.size() < minHeap.size()) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }
        if (maxHeap.size() > 0 && minHeap.size() > 0 && maxHeap.peek()>minHeap.peek()) {
            changeMaxHeapAndMinHeapPeek(maxHeap, minHeap);
        }
    }

    private void changeMaxHeapAndMinHeapPeek(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        int max = maxHeap.peek();
        int min = minHeap.peek();
        if (max > min) {
            maxHeap.poll();
            maxHeap.offer(minHeap.poll());
            minHeap.offer(max);
        }
    }

    public double findMedian() {
        if (maxHeap.size() == minHeap.size()) {
            return (double) (maxHeap.peek() + minHeap.peek()) / 2;
        } else {
            return maxHeap.size() > minHeap.size() ? maxHeap.peek() : minHeap.peek();
        }
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(-1);
        assert medianFinder.findMedian() == -1.0;
        medianFinder.addNum(-2);
        assert medianFinder.findMedian() == -1.5;
        medianFinder.addNum(-3);
        assert medianFinder.findMedian() == -2.0;
        medianFinder.addNum(-4);
        assert medianFinder.findMedian() == -2.5;
        medianFinder.addNum(-5);
        assert medianFinder.findMedian() == -3.0;

    }
}
