package 堆.t373;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @auther: sotowang
 * @date: 2020/01/14 22:12
 */
public class KSmallestPairs {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(k, (a, b) -> (b[0] + b[1] - a[0] - a[1]));
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (maxHeap.size() < k) {
                    maxHeap.offer(new int[]{nums1[i], nums2[j]});
                } else {
                    if (Arrays.stream(maxHeap.peek()).sum() > (nums1[i] + nums2[j])) {
                        maxHeap.poll();
                        maxHeap.offer(new int[]{nums1[i], nums2[j]});
                    } else {
                        break;
                    }
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            int[] temp = maxHeap.poll();
            List<Integer> tempList = new ArrayList<>();
            tempList.add(temp[0]);
            tempList.add(temp[1]);
            res.add(0, new ArrayList<>(tempList));
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums3 = {1, 1, 2};
        int[] nums4 = {1, 2, 3};
        System.out.println(new KSmallestPairs().kSmallestPairs(nums3, nums4, 2));
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        System.out.println(new KSmallestPairs().kSmallestPairs(nums1, nums2, 3));
    }
}
