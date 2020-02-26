package 树.t440;

/**
 * @auther: sotowang
 * @date: 2020/2/26 16:29
 */
public class FindKthNumber {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        k--;
        while (k > 0) {
            long steps = 0, first = curr, last = curr + 1;
            while (first <= n) {
                steps += Math.min(last, n + 1) - first;
                first *= 10;
                last *= 10;
            }
            if (steps <= k) {
                curr += 1;
                k -= steps;
            } else {
                curr *= 10;
                k -= 1;
            }
        }
        return curr;
    }

    public static void main(String[] args) {
        assert new FindKthNumber().findKthNumber(10, 3) == 2;
        assert new FindKthNumber().findKthNumber(13, 7) == 3;

    }
}
