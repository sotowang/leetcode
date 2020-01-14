package 二分查找.t668;

/**
 * @auther: sotowang
 * @date: 2020/01/14 19:49
 */
public class FindKthNumber {
    public int findKthNumber(int m, int n, int k) {
        int left = 1;
        int right = m * n;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (left == mid) {
                break;
            }
            int count = 0;
            for (int i = 1; i <= m; i++) {
                int cnt = mid / i;
                if (cnt == 0) {
                    break;
                } else {
                    count += Math.min(n, cnt);
                }
                if (count > k) {
                    break;
                }
            }
            if (count >= k) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        assert new FindKthNumber().findKthNumber(38, 40, 955) == 437;
        assert new FindKthNumber().findKthNumber(2, 3, 6) == 6;
        assert new FindKthNumber().findKthNumber(42, 34, 401) == 126;
        assert new FindKthNumber().findKthNumber(3, 3, 5) == 3;

    }
}
