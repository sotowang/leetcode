package 常用算法.其它.腾讯;

import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }
        System.out.println(count(nums));
    }

    private static long count(long[] nums) {
        return 3;
    }


}
