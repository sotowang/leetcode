package 常用算法.其它;

import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/29 19:40
 */
public class Example5 {
    private static long calculate(long n){
        return lcm(n, n - 1);
    }
    private static long gcd(long min,long max){
        boolean flag = true;
        long index = 1;
        long tem = -1;
        while(flag){
            tem = min/index++;
            if(max%tem == 0 && min % tem == 0){
                flag = false;
            }
        }
        return tem;
    }
    private static long lcm(long min,long max){
        long gcd = gcd(min, max);
        long a = min/gcd;
        return max*a-gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(calculate(n));

    }
}
