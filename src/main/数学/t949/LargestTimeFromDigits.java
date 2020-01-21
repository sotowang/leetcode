package 数学.t949;

/**
 * @auther: sotowang
 * @date: 2020/1/21 14:12
 */
public class LargestTimeFromDigits {
    public String largestTimeFromDigits(int[] A) {
        int res = -1;

        //hour=i*10+j
        //minute = k*10+l
        for (int i = 0; i < 4; i++) {
            if (A[i] > 2) {
                continue;
            }
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    continue;
                }
                int hour = A[i] * 10 + A[j];
                if (hour > 23) {
                    continue;
                }
                for (int k = 0; k < 4; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    int l = 0 + 1 + 2 + 3 - i - j - k;
                    int minute = A[k] * 10 + A[l];
                    if ( minute < 60) {
                        res = Math.max(hour * 60 + minute, res);
                    }
                }
            }
        }
        return res >= 0 ? String.format("%02d:%02d", res / 60, res % 60) : "";
    }


    public static void main(String[] args) {
        int[] A6 = {0, 0, 0, 0};
        assert new LargestTimeFromDigits().largestTimeFromDigits(A6).equals("00:00");
        int[] A4 = {4, 2, 4, 4};
        assert new LargestTimeFromDigits().largestTimeFromDigits(A4).equals("");
        int[] A5 = {2, 0, 6, 6};
        assert new LargestTimeFromDigits().largestTimeFromDigits(A5).equals("06:26");
        int[] A2 = {0, 4, 0, 0};
        assert new LargestTimeFromDigits().largestTimeFromDigits(A2).equals("04:00");
        int[] A3 = {1, 9, 3, 0};
        assert new LargestTimeFromDigits().largestTimeFromDigits(A3).equals("19:30");
        int[] A1 = {5, 5, 5, 5};
        assert new LargestTimeFromDigits().largestTimeFromDigits(A1).equals("");
        int[] A = {1, 2, 3, 4};
        assert new LargestTimeFromDigits().largestTimeFromDigits(A).equals("23:41");

    }
}
