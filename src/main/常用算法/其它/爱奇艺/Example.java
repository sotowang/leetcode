package 常用算法.其它.爱奇艺;


import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {
    public static int calc(int n) {
        int tem = n;
        int count = 0;
        int base = 5;
        while (n / base != 0) {
            count += n / base;
            base *= 5;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calc(n));
    }

}
