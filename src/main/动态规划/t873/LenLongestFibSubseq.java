package 动态规划.t873;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

/**
 * @auther: sotowang
 * @date: 2020/2/19 16:24
 */
public class LenLongestFibSubseq {
    public int lenLongestFibSubseq(int[] A) {
        if (A.length == 3 && A[0] + A[1] != A[2]) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int sum = A[i] + A[j];
                int pre = A[j];
                int count = 2;
                while (set.contains(sum)) {
                    count++;
                    int temSum = sum;
                    sum += pre;
                    pre = temSum;
                }
                max = Math.max(count, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A3 = {1, 3, 5};
        assert new LenLongestFibSubseq().lenLongestFibSubseq(A3) == 0;
        int[] A2 = {2, 4, 7, 8, 9, 10, 14, 15, 18, 23, 32, 50};
        assert new LenLongestFibSubseq().lenLongestFibSubseq(A2) == 5;
        int[] A1 = {1, 3, 7, 11, 12, 14, 18};
        assert new LenLongestFibSubseq().lenLongestFibSubseq(A1) == 3;
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        assert new LenLongestFibSubseq().lenLongestFibSubseq(A) == 5;

    }
}
