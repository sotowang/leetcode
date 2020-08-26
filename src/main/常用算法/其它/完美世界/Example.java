package 常用算法.其它.完美世界;


import java.util.Scanner;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {

    private static long calc(int days) {
        long x = 1;
        int count = 0;
        long res = 0;
        while (count++ < days) {
            res = (x + 1) << 1;
            x = res;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        System.out.println(calc(days));
    }

}
