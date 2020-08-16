package 常用算法.其它.美团;


import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/29 19:40
 */
public class Example5 {
    public static long solution(int max, int pos) {
        long start = 1;
        boolean bigflag = true;
        long count = 0;
        int index = 1;
        while (bigflag) {
            if (start * Math.pow(start, index) <= max) {
                count++;
            } else {
                bigflag = false;
            }
            start++;
        }

        return count % 998244353;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solution(n, m));
    }
}
