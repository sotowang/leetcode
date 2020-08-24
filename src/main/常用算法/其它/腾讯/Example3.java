package 常用算法.其它.腾讯;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: sotowang
 * @date: 2020/3/20 8:53
 */
public class Example3 {
    public static long solution(long n) {
        if (n <= 10) {
            return n;
        }
        long max = Integer.MIN_VALUE;
        long base = 9;
        Set<Long> set = new HashSet<>();
        while (base <= n) {
            if (!set.add(base) || !set.add(n - base)) {
                break;
            }
            max = Math.max(max, sum(base, n - base));
            base += 10;
        }
        return max;
    }

    private static long sum(long a, long b) {
        long sum = 0;
        while (a != 0) {
            sum += a%10;
            a /= 10;
        }
        while (b != 0) {
            sum += b%10;
            b /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long n = sc.nextLong();
            System.out.println(solution(n));
        }
    }


}
