package 堆.t378;

import java.util.PriorityQueue;

/**
 * @auther: sotowang
 * @date: 2020/01/14 21:27
 */
public class kthSmallest {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return 0;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, (a, b) -> b - a);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (maxHeap.size() >= k) {
                    if (maxHeap.peek() > matrix[i][j]) {
                        maxHeap.poll();
                        maxHeap.offer(matrix[i][j]);
                    }
                } else {
                    maxHeap.offer(matrix[i][j]);
                }
            }
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        assert new kthSmallest().kthSmallest(matrix, 8) == 13;
    }
}
