package 滑动窗口.t239;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @auther: sotowang
 * @date: 2020/01/02 17:23
 */
public class MaxSlidingWindow {
    public int[] maxSlidingWindow2(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int[] res = new int[nums.length + 1 - k];
        Queue<Integer> maxHeap = new PriorityQueue<>(k, (a, b) -> (b - a));
        for (int i = 0; i < k; i++) {
            maxHeap.add(nums[i]);
        }
        int index = 0;
        for (int i = k; i < nums.length; i++) {
            res[index] = maxHeap.peek();
            maxHeap.add(nums[i]);
            maxHeap.remove(nums[index]);
            index++;
        }
        res[index] = maxHeap.peek();
        return res;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        LinkedList<Integer> win = new LinkedList<>();
        int[] res = new int[nums.length + 1 - k];
        for (int i = 0; i < nums.length; i++) {
            while (!win.isEmpty() && nums[win.peekLast()] <= nums[i]) {
                win.pollLast();
            }
            win.offer(i);
            if (win.peek() <= i - k) {
                win.pollFirst();
            }
            if (i + 1 >= k) {
                res[i + 1 - k] = nums[win.peek()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        Arrays.stream(new MaxSlidingWindow().maxSlidingWindow(nums, 3)).forEach(e -> System.out.print(e + " "));

    }
}
