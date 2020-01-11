package 其他.t1093;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/1/11 17:08
 */
public class SampleStats {
    public double[] sampleStats(int[] count) {
        double[] res = new double[5];
        double min = -1.0;
        double max = -1.0;
        double sum = 0.0;
        int mode = 0;
        int cnt = Arrays.stream(count).sum();
        int index = cnt >> 1;
        double l1 = -1.0;
        double l2 = -1.0;
        int countCnt = 0;
        for (int i = 0; i < count.length; i++) {
            if (min == -1 && count[i] != 0) {
                min = i;
            }
            if (count[i] > 0) {
                countCnt += count[i];
                max = i;
                if (count[i] > count[mode]) {
                    mode = i;
                }
                if (l2 == -1.0 && l1 != -1.0) {
                    l2 = i;
                }
                if (l1 == -1.0 && countCnt >= index) {
                    l1 = i;
                    if (countCnt - index > 0) {
                        l2 = i;
                    }
                }

            }
            sum += count[i] * i;
        }
        double avg = sum / cnt;
        if (cnt % 2 == 1) {
            res[3] = l1;
        } else {
            res[3] = (l1 + l2) /2;
        }

        res[0] = min;
        res[1] = max;
        res[2] = avg;
        res[4] = mode;
        return res;
    }

    public static void main(String[] args) {
        int[] count = new int[256];
        count[1] = 1;
        count[2] = 3;
        count[3] = 4;
        double[] res = new SampleStats().sampleStats(count);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + ", ");
        }
    }
}
