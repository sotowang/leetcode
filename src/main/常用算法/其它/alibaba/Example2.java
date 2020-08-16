package 常用算法.其它.alibaba;

import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 {
    private static long solution(String str) {
        long count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            count *= ((str.charAt(i) - '0') + (str.charAt(i + 1) - '0'));
            count = count % 1000000007;

            count += (str.charAt(i + 1) - '0' + 1) + (str.charAt(i + 2) - '0');
            count = count % 1000000007;
        }
        return count % 1000000007;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String str = in.next();
            System.out.println(solution(str));
        }

    }
}
