package 常用算法.其它;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/20 9:21
 */
public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            nums[index++] = sc.nextInt();
        }
        int sum = Arrays.stream(nums).sum();
        int res = 0;
        while (sum > 0) {
            int[] shunzi;
            while ((shunzi = findShunzi(nums))[0] != -1) {
                res++;
                for (int i = shunzi[0]; i <= shunzi[1]; i++) {
                    nums[i]--;
                    sum--;
                }
            }
            int[] liandui;
            while ((liandui = findLianui(nums))[0] != -1) {
                res++;
                for (int i = liandui[0]; i <= liandui[1]; i++) {
                    nums[i] -= 2;
                    sum -= 2;
                }
            }
            boolean flag = false;
            while (!flag) {
                flag = true;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == 2) {
                        sum -= 2;
                        res++;
                        nums[i] -= 2;
                    }
                    if (nums[i] == 2) {
                        flag = false;
                    }
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    sum -= 1;
                    res++;
                    nums[i] -= 1;
                }
            }

        }
        System.out.println(res);
    }

    private static int[] findShunzi(int[] num) {
        int start = 0;
        int cnt = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                cnt++;
                if (cnt == 5) {
                    return new int[]{start, i};
                }
            } else {
                start = i + 1;
                cnt = 0;
            }
        }
        return new int[]{-1};
    }

    private static int[] findLianui(int[] num) {
        int start = 0;
        int cnt = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 2) {
                cnt++;
                if (cnt == 3) {
                    return new int[]{start, i};
                }
            } else {
                start = i + 1;
                cnt = 0;
            }
        }
        return new int[]{-1};
    }

}
