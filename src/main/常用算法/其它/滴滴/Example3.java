package 常用算法.其它.滴滴;

import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {
    public static int solution(long[] nums, int n) {
        int res = n;
        long xor = 0;
        for (int i = 0; i < n; i++) {
            xor |= nums[i];
            if (xor == nums[i]) {
                res = 1;
            } else {
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }
        System.out.println(solution(nums, n));

    }


}
