package 常用算法.其它.字节跳动;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @auther: sotowang
 * @date: 2020/3/20 9:21
 */
public class Example4 {
    private static long maxProfit(int aOrder, int bOrder, List<int[]> list) {
        long profit = 0;
        Collections.sort(list, (a, b) -> (b[0] - a[0]));
        for (int i = 0; i < aOrder; i++) {
            int[] tem = list.get(i);
            profit += tem[0];
        }
        for (int i = 0; i < aOrder; i++) {
            list.remove(i);
        }
        Collections.sort(list, (a, b) -> (b[1] - a[1]));
        for (int i = 0; i < bOrder; i++) {
            int[] tem = list.get(i);
            profit += tem[1];
        }
//        for (int i = 0; i < list.size(); i++) {
//            int[] tem = list.get(i);
//             profit += tem[0] * aOrder;
//            if (max < profit) {
//                max = profit;
//            }
//        }
        return profit;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carSum = sc.nextInt();
        int aOrder = sc.nextInt();
        int bOrder = sc.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < carSum; i++) {
            int[] nums = new int[carSum];
            int a = sc.nextInt();
            int b = sc.nextInt();
            nums[0] = a;
            nums[1] = b;
            list.add(nums);
        }
        System.out.println(maxProfit(aOrder, bOrder, list));
    }
}

