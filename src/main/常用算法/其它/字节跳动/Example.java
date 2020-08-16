package 常用算法.其它.字节跳动;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {

    private static boolean isReverse(long n, long max) {
        long n_4 = n * 4;
        if (n_4 > max) {
            return false;
        }
        StringBuilder sb1 = new StringBuilder(String.valueOf(n_4));
        long r = Long.valueOf(sb1.reverse().toString());
        if (r == n) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        List<Long> list = new ArrayList<>();
        for (long i = 1; i <= n / 4 + 1; i++) {
            if (isReverse(i, n)) {
                count++;
                list.add(i);
            }
        }
        if (count == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(count);
        for (long m : list) {
            System.out.print(m);
            System.out.print(" ");
            System.out.println(4 * m);
        }
    }

}
