package 字节跳动.数组.t215;

import java.util.PriorityQueue;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minStack = new PriorityQueue<>(k, (a, b) -> (a - b));
        for (int i = 0; i < k; i++) {
            minStack.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            minStack.add(nums[i]);
            minStack.poll();
        }
        return minStack.peek();
    }

    public static void main(String[] args) {
//        System.out.println(new FindKthLargest().findKthLargest(new int[]{3, 2, 1, 5, 6, 4},2));
        System.out.println(new FindKthLargest().findKthLargest(new int[]{3,2,3,1,2,4,5,5,6},4));
    }
}
