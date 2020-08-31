package 常用算法.其它.广联达;

import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 {
    private static long transfer(long[] nums) {
        long x0 = (nums[0] + nums[1] + nums[2] + nums[3]) / 4;
        long sum = nums[0] + nums[1] + nums[2] + nums[3];

        for (long i = x0; i >= 0; i--) {
            long left = sum - (4 * i);
            long right = 0;
            if (i - nums[0] > 0) {
                right += i - nums[0];
            }
            if (i - nums[1] > 0) {
                right += i - nums[1];
            }
            if (i - nums[2] > 0) {
                right += i - nums[2];
            }
            if (i - nums[3] > 0) {
                right += i - nums[3];
            }
            if (left >= right) {
                return i * 4;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] nums = new long[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = in.nextLong();
        }
        System.out.println(transfer(nums));

    }
}
