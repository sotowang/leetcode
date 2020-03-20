package 常用算法.其它;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:22
 */
public class Example {
    private int name;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        long sum1 = a[n - 1] + a[n - 2] + a[n - 3];
        long sum2 = b[n - 1] + b[n - 2] + b[n - 3];
        System.out.println(sum1 > sum2 ? sum1 : sum2);
    }

}
