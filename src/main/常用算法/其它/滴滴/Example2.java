package 常用算法.其它.滴滴;

import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/13 20:52
 */
public class Example2 {
    private static long[] build(int n) {
        long[] res = new long[n * n];
        int index = 2;
        long one = 1;
        long two = 1;
        res[0] = 1;
        res[1] = 1;
        for (long i = 3; i <= n * n; i++) {

            long third = one + two;
            one = two;
            two = third;
            res[index++] = two;
        }
        return res;
    }

    private static long[][] print(int n,long[] nums) {
        long[][] res = new long[n][n];
        int index = nums.length - 1;
        //设置上,下,左, 右 边界
        int up = 0;
        int down = n - 1;
        int left = 0;
        int right = n - 1;

        while (true) {
            //向右走,到尽头
            for (int i = left; i <= right; i++) {
                res[up][i] = nums[index--];
            }
            //重新设定上边界
            if (++up > down) {
                break;
            }
            //向下走 到尽头
            for (int i = up; i <= down; i++) {
                res[i][right] = nums[index--];
            }
            //重新设定右边界
            if (--right < left) {
                break;
            }
            //向左走 到尽头
            for (int i = right; i >= left; i--) {
                res[down][i] = nums[index--];
            }
            //重新设定下边界
            if (--down < up) {
                break;
            }

            //向上走 到尽头
            for (int i = down; i >= up ; i--) {
                res[i][left] = nums[index--];
            }
            //重新设定左边界
            if (++left >right) {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 10) {
            return;
        }

        long[][] nums = print(n, build(n));
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length - 1; j++) {
                System.out.print(nums[i][j]);
                System.out.print(" ");
            }
            System.out.println(nums[i][nums[0].length - 1]);
        }
    }
}
